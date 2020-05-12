import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import model.PedidoModel;

public class Pedido {
	
private Connection conexao;
	
	public Pedido() throws ClassNotFoundException, SQLException {
		this.conexao = new Conexao().getConnection();
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList buscar(PedidoModel pedido) {
		try {
			String sql = "";
			if (pedido.getNumeroPedido() != 0) {
				sql = "SELECT * from tb_pedido WHERE descricao LIKE '%" + pedido.getNumeroPedido() + "%' ";
			} else if(!pedido.getDescricao().isEmpty()) {
				sql = "SELECT * from tb_pedido where tipo like '%" + pedido.getDescricao() + "%' ";
			}
			
			ArrayList<Pedido> obj = new ArrayList(); 
						
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				obj.addAll((Collection<? extends Pedido>) new PedidoModel(	
						rs.getInt("numeroPedido"),
						rs.getString("Descricao"),
						rs.getString("dataCompra"),
						rs.getString("status"),
						rs.getString("notaFiscal"), 
						null)
				);
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
