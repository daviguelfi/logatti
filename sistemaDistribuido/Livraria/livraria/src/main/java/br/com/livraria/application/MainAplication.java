package br.com.livraria.application;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.livraria.model.Livraria;
import br.com.livraria.model.Livro;
import br.com.livrvaria.util.ConnectionSQLite;

public class MainAplication {

	public static void main(String[] args) {
		System.out.println("Inico...");
		
		try {
			ConnectionSQLite conexao = new ConnectionSQLite();
			Livro livro = new Livro(4, "livro 3", "teste", "10/10/2010", 300, "acao");
			Livraria livraria = new Livraria(3, livro);
			
//			inserirLivro(livro, conexao);
//			consultarLivro(conexao);
			
//			inserirLivraria(livraria, conexao);
			consultarLivraria(conexao);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	private static void consultarLivro(ConnectionSQLite conexao) throws SQLException {
		System.out.println("Inicio - Teste consulta");
		ResultSet rs = conexao.execComRetorno("select isbn, titulo, autor, anoLancamento, qtdPaginas, genero from tb_livro");
		while (rs.next()) {
			System.out.println(" { 'isbn': '" + rs.getInt("isbn") + 
							   "', 'titulo': '" + rs.getString("titulo") +
							   "', 'autor': '" + rs.getString("autor") +
							   "', 'ano do lancamento': '" + rs.getString("anoLancamento") +
							   "', 'quantidade de páginas': '" + rs.getInt("qtdPaginas") +
							   "', 'genero': '" + rs.getString("genero") + "' }");
		}
		System.out.println("Fim - Teste consulta");
		
	}

	private static void inserirLivro(Livro livro, ConnectionSQLite conexao) throws SQLException {
		System.out.println("Teste inclusão");
		//execusao no sqlite
		conexao.exec("INSERT INTO tb_livro (isbn, titulo, autor, anoLancamento, qtdPaginas, genero) VALUES (" + livro.getIsbn() +
				",'" + livro.getTitulo() +
				"','" + livro.getAutor() +
				"','" + livro.getAnoLancamento() + 
				"','" + livro.getQtdPaginas() + 
				"','" + livro.getGenero() + "')"); 
		System.out.println("fim teste inclusao");
		
	}
	
	private static void consultarLivraria(ConnectionSQLite conexao) throws SQLException {
		System.out.println("Inicio - Teste consulta");
		ResultSet rs = conexao.execComRetorno("select id, Livro from tb_livraria");
		while (rs.next()) {
			System.out.println(" { 'id': '" + rs.getInt("id") + 
					   			"', 'livro': '" + rs.getString("livro") + "' }");
		}
		System.out.println("Fim - Teste consulta");
		
	}

	private static void inserirLivraria(Livraria livraria, ConnectionSQLite conexao) throws SQLException {
		System.out.println("Teste inclusão");
		//execusao no sqlite
		conexao.exec("INSERT INTO tb_livraria (id, Livro ) VALUES ("+ livraria.getId()+",'"+livraria.getLivro()+"')");
		System.out.println("fim teste inclusao");
		
	}
	
}
