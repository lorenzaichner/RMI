
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;


public class QuadratImpl extends UnicastRemoteObject implements Quadrat {


    public QuadratImpl() throws RemoteException {

    }

    public long quadrat(long i) {
        return i * i;
    }           //Implementation der Funktion

}