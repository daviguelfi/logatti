import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import javax.swing.JOptionPane;

public class ChatClient {
	
public static void main(String [] Args) {
		
		String nome = "";
		String msgp = "";
		String pedido = "";
		String nota_fiscal="";
		String status="";
		
		nome = JOptionPane.showInputDialog("Bem vindo ao Chat é um prazer ter você, qual é o seu nome? ");
		
		
		try {	
				while (msgp != "0") 
					{							
					
					msgp = JOptionPane.showInputDialog("Chat - " + nome + " Entre com a mensagem. (Entre com 0 para sair)");
					pedido = JOptionPane.showInputDialog("Chat - " + pedido +"Digite o numero do seu pedido:");
					nota_fiscal= JOptionPane.showInputDialog("Chat - " + nota_fiscal + " Digite o numero da sua nota fiscal ");
					
					//Retornar a mensagem de STATUS DESTE PEDIDO.	
					//status= JOptionPane.showInputDialog("Chat - " + status + " O status do seu pedido é ");
					IChatInteligente objChat = (IChatInteligente) Naming.lookup("rmi://localhost:8282/chat");					
					Message msg = new Message(nome, msgp);
					objChat.sendMessage(msg);
					System.out.println(returnMessage(objChat.retrieveMessage()));
					}
						
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();			
		} catch (NotBoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
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