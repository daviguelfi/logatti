
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IChatInteligente extends Remote {

	void sendMessage(Message msg) throws RemoteException;
	List<Message> retrieveMessage() throws RemoteException;
	
}
