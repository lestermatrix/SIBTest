import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {

	
	String url = "jdbc:oracle:thin:sibtest/sibtest123@localhost:1521:xe";
	
	static Connection conn = null;
	
	public static Connection getDBConnection() throws SQLException {
		
    	String dbURL2 = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "sibtest";
        String password = "sibtest123";
        conn = DriverManager.getConnection(dbURL2, username, password);
        
        return conn;
	}
	
}
