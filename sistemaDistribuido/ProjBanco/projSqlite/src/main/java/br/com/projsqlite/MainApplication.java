package br.com.projsqlite;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.proj.projsqlite.model.Pet;
import br.com.projsqlite.util.ConnectionSQLite;

public class MainApplication {

	public static void main(String[] args) {
		System.out.println("Inicio...");
		
		try {
			
			ConnectionSQLite conexao = new ConnectionSQLite();
			Pet pet = new Pet(3, "leao", "vira lata");
			//inserir(pet, conexao);
			
			consultar(conexao);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	private static void consultar(ConnectionSQLite conexao) throws SQLException {
		System.out.println("Inicio - Teste consulta");
		ResultSet rs = conexao.execComRetorno("select id, nome, raca from tb_pet");
		while (rs.next()) {
			System.out.println(" { 'id': '" + rs.getInt("id") + 
							   "', 'nome': '" + rs.getString("nome") +
							   "', 'raca': '" + rs.getString("raca") + "' }");
		}
		System.out.println("Fim - Teste consulta");
	}


	private static void inserir(Pet pet, ConnectionSQLite conexao) throws SQLException {

		System.out.println("Teste inclusão");
		//execusao no sqlite
		conexao.exec("INSERT INTO tb_pet (id, nome, raca) VALUES ("+pet.getId()+",'"+pet.getNome()+"','"+pet.getRaca()+"')");
		System.out.println("fim teste inclusao");
	}
	
	
	
}
