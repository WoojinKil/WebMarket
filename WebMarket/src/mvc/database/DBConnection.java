package mvc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/webmarketdb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "root";
		String password = "7729";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
		return conn;
		
	}
}
