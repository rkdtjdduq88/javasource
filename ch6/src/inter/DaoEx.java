package inter;

public class DaoEx {

	public static void main(String[] args) {
		//OracleDao oracle = new OracleDao(); 아래도 되고 위에도 됨
		DataAccessObject oracle = new OracleDao();
		dbWork(oracle);
		//Mysql mysql = new Mysql(); 아래도 되고 위에도됨
	    DataAccessObject mysql = new Mysql();
		dbWork(mysql);
//		dbWork2(oracle);
	}
	
	static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
//	static void dbWork2(OracleDao oracle) {
//		oracle.select();
//		oracle.insert();
//		oracle.update();
//		oracle.delete();
//		
//	}

}
