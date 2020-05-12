import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ChatInteligente extends UnicastRemoteObject implements IChatInteligente {

	protected ChatInteligente() throws RemoteException	{
		super();
	}

	@Override
	public void sendMessage(Message msg) throws RemoteException {
		Message.setListMessage(msg);
		
	}

	@Override
	public List<Message> retrieveMessage() throws RemoteException {
		return Message.getListMessage();
	}
}
