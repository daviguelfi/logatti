import java.sql.DriverManager;

public class Conexao {

	public static java.sql.Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = null;
			con = (Connection) DriverManager.getConnection(url)
		}
		
	}
	
}
