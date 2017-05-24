/**
 * Created by stdeljak on 21.03.2017.
 */

import com.sun.deploy.util.SessionState;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface  Ant  extends Remote {           

    void Antwort(String i, Client c) throws RemoteException;
}

