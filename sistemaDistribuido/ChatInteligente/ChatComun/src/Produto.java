import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.ProdutoModel;

public class Produto {
	
	private Connection conexao;
	
	public Produto() throws ClassNotFoundException, SQLException {
		this.conexao = new Conexao().getConnection();
	}
	
	public ArrayList buscar(ProdutoModel produto) {
		try {
			String sql = "";
			if (!produto.getDescricao().isEmpty()) {
				sql = "SELECT * from tb_produto WHERE descricao LIKE '%" + produto.getDescricao() + "%' ";
			} else if(!produto.getTipo().isEmpty()) {
				sql = "SELECT * from tb_produto where tipo like '%" + produto.getTipo() + "%' ";
			}
			
			ArrayList<Object[]> obj = new ArrayList(); 
						
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				obj.add(new Object[] {
						rs.getInt("id"),
						rs.getString("Descricao"),
						rs.getString("Tipo"),
				});
			}
			ps.close();
			rs.close();
			conexao.close();
			
		} catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher a lista");
            return null;
        }
		return null;
	}
}
