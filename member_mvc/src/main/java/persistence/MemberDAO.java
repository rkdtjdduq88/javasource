package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.catalina.connector.Response;

import domain.ChangeDTO;
import domain.MemberDTO;

public class MemberDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
		
	public Connection getConnection() {
				
		try {
			
			Context ctx = new InitialContext();
			
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/myoracle");
			
			Connection con = ds.getConnection();
			// DML 실행 시 트랜잭션 관리를 직접 하겠음
			con.setAutoCommit(false);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void close(Connection con, PreparedStatement pstmt) {
		try {			
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	// 로그인
	// 아이디와 비밀번호 일치하면 아이디와 이름만 추출
	// select userid,name from membertbl where userid=? and password=?
	public MemberDTO isLogin(String userid, String password) {
		MemberDTO dto = null;
		
		try {
			con = getConnection();
			// sql = 아이디와 비밀번호가 일치하면
			String sql = "select userid,name from membertbl where userid=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
						
			if(rs.next()) {
				// 아이디와 이름만 추출
				dto = new MemberDTO();
				dto.setUserid(rs.getString("userid"));
				dto.setName(rs.getString("name"));
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	
	// 회원가입
	public boolean register(String userid, String password, String name, String gender, String email) {
		boolean flag = false;
		
		try {
			con = getConnection();
			
			String sql = "insert into membertbl(userid,password,name,gender,email) values(?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setString(4, gender);
			pstmt.setString(5, email);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				flag = true;
				commit(con);
			}			
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	// 비밀번호 변경
	// update from membertbl set password = ? where userid =?
	public boolean update(ChangeDTO dto) {
		boolean flag = false;
		try {
			con = getConnection();
			String sql = "update membertbl set password = ? where userid =? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getConfirmPassword());
			pstmt.setString(2, dto.getUserid());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				flag = true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	// 회원탈퇴 - 아이디와 비밀번호 일치시
	// delete from membertbl where userid = ? 
	public boolean delect(MemberDTO dto) {
		boolean flag = false;
		try {
			con = getConnection();
			String sql = "delete from membertbl where userid = ? and password = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				flag = true;
				commit(con);
			}
			
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	// 중복아이디 검사
	// 존재하는 아이디가 있다면 true 리턴 없다면 false 리턴
	public boolean duplicateId(String userid) {
		boolean flag = true;
		try {
			con = getConnection();
			String sql = "select count(*) from membertbl where userid=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int cnt = rs.getInt(1);
				if(cnt>0) flag = false;
			}
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return flag;
	}
}



























