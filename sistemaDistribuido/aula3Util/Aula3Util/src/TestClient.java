import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.io.IOException;

import javax.swing.JOptionPane;

public class TestClient {

	public static void main(String[] args) throws IOException {

		String nome = "";
		String msgp = "";
		
//		FileWriter arq = new FileWriter("/home/davi/Desktop/workspace/logatti/sistemaDistribuido/aula3Util/chat.txt");
//		PrintWriter recordArq = new PrintWriter(arq);
//		recordArq(msgp);

		nome = JOptionPane.showInputDialog("Bem vindo ao chat, Qual é o seu nome:");
		try {

			while (!msgp.equals("0")) {
				msgp = JOptionPane.showInputDialog("Chat - " + nome + " Entre com a mensagem. (Entre com 0 para sair)");
				IChatAula objChat = (IChatAula) Naming.lookup("rmi://localhost:8282/chat");
				Message msg = new Message(nome, msgp);
				System.out.println("Seja bem vindo ao nosso chat " + nome);
				objChat.sendMessage(msg);
				System.out.println(returnMessage(objChat.retrieveMessage()));
				if(msgp.equals("0")) {
					System.out.println("Obrigado por usar nosso chat " + nome);					
				}
				
			}
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		
//		arq.close();
	}


	private static String returnMessage(List<Message> lst) {
		
		String valor = "";
		for (Message message : lst) {
			valor += message.getUser() + ": " + message.getMessage() + "\n";
		}
		
		return valor;
	}
}
