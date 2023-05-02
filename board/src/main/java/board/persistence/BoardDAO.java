package board.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import board.domain.BoardDTO;

public class BoardDAO {
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
	
	// 게시글 등록	
	// insertArticle(BoardDTO boardDTO)
	// re_ref : bno 동일한 값, re_lev : 0, re_seq : 0
	public boolean insertArticle(BoardDTO boardDto) {
		boolean flag = false;
		try {
			con = getConnection();
			
			String sql = "insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq) ";
				sql+= "values(board_seq.nextval, ?, ?, ?, ?, ?, board_seq.currval, ?, ?)";
			pstmt = con.prepareStatement(sql);			
			pstmt.setString(1, boardDto.getName());
			pstmt.setString(2, boardDto.getPassword());
			pstmt.setString(3, boardDto.getTitle());
			pstmt.setString(4, boardDto.getContent());
			pstmt.setString(5, boardDto.getAttach());
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
							
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
	
	// board 전체 가져오기
	// bno, title, name, regdate, cnt
	public List<BoardDTO> getRows(){
		List<BoardDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			
			String sql = "select bno,title,name,regdate,cnt from board order by bno desc";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setCnt(rs.getInt("cnt"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
}
























