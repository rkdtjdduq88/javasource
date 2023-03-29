package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.print.attribute.HashPrintJobAttributeSet;

public class Test {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection(){
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String password = "TIGER";
		try {
			return DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
		
	}
	public static void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		
	}
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
	}
}
