package test;

public class Test {

	static {
		try {
			Class.forName("Oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
