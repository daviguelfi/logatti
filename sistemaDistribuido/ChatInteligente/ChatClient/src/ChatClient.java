import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import model.PedidoModel;
import model.ProdutoModel;

import java.util.Scanner;

public class ChatClient {
	
	private Pedido pedido;
	private Produto produto;
	
public static void main(String [] Args) {
		Scanner sc = new Scanner(System.in);
		String msgp = "";
		pedido = new Pedido();
		produto = new Produto();
		Date date = new Date();
		ProdutoModel produto = new ProdutoModel(1, "sapato", "calçado");
		PedidoModel pedido = new PedidoModel(1, "compra de sapato", date, "finalizado", produto);
		ArrayList<Pedido> dados = new ArrayList();
		
		msgp = JOptionPane.showInputDialog("O que deseja saber?");
		if(msgp.contains("pedido")) {
			if(JOptionPane.showConfirmDialog(null, "O número do pedido:", "Pedido",  JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){

                objs = pedido.buscar(pedido);

                for (Pedido obj : objs){
                    JOptionPane.showConfirmDialog(null, obj.getDescricao(), "Pedido", JOptionPane.OK_OPTION);
                }

		} else if (JOptionPane.showConfirmDialog(null, "Saber o status do pedido?", "Pedido",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            dados = pedido.buscar(pedido);

            for (Pedido obj : objs){
                JOptionPane.showConfirmDialog(null, obj.getStatus(), "Pedido", JOptionPane.OK_OPTION);
            }
        } else if(msgp.contains("numero")){
            if(JOptionPane.showConfirmDialog(null, "Seja saber o número da nota fiscal?", "Nota fiscal",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){

                objs = pedido.buscar(pedido);

                for (Pedido obj : objs){
                    JOptionPane.showConfirmDialog(null, obj.getNumPedido(), "Pedido", JOptionPane.OK_OPTION);
                }
            }
        }
	}
		
	private	static String returnMessage(List<Message> lst) {
		
		String valor = "";
		for (Message message : lst) {
			valor += message.getUser() + ": " + message.getMessage() + "\n";
		} 
		return valor;	
	}
	

}