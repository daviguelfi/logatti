import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

	private static Connection conexao;
	private static Statement statement;
	
	public java.sql.Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		conexao = DriverManager.getConnection("jdbc:sqlite:/home/davi/Área de Trabalho/workspace/logatti/sistemaDistribuido/ChatInteligent/chat.db");
		statement = conexao.createStatement();
		conexao.setAutoCommit(true);
		System.out.println("conectou!");
		return conexao;
	}
	
	public void desconectar() {
		try {
			conexao.close();
			System.out.println("conectou!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//insert delete update
	public void exec (String sql) throws SQLException {
		statement.execute(sql);
	}
	
	//SELECT
	public ResultSet execComRetorno(String sql) throws SQLException {
		return statement.executeQuery(sql);
	}
	
}
