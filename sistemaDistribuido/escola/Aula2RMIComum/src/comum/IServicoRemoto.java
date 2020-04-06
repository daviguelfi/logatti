package comum;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServicoRemoto extends Remote {
	void inserir(Pessoa p) throws RemoteException;
	List<Pessoa> listarPessoa() throws RemoteException;
}
