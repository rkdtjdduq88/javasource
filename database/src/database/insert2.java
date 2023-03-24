package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insert2 {

	public static void main(String[] args) {
		
		// insert,update,delete 작업 시 두 개의 객체만 사용
		// DML 작업 시 성공한 행의 개수만 전달받게 됨
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			System.out.print("부서번호 >> ");
			int deptno = sc.nextInt();
			System.out.print("부서명 >> ");
			String dname = sc.next();
			System.out.print("지역 >> ");
			String loc = sc.next();
			
			//sql 문 작성
			String sql = "insert into dept_temp(deptno, dname, loc) values(?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			//select : excuteQuery(), DML : executeQuery()
			int count = pstmt.executeUpdate();
			
			if(count > 0) {
				System.out.println("입력 성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
