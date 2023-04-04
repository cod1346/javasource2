package inter;

public class OracleDaoEx {

	public static void main(String[] args) {
		OracleDao oracle = new OracleDao();
		Mysql mysql = new Mysql();

		
		dbWork(mysql);
		dbWork(oracle);
	}

	
	static void dbWork(DataAccessObject dataAccessObject) {
		dataAccessObject.select();
		dataAccessObject.insert();
		dataAccessObject.update();
		dataAccessObject.delete();
				
	}
	
	
	
	
	
}
