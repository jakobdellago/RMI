/**
 * Created by stdeljak on 21.03.2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client implements Serializable {

    public static void main(String[] args) {   
        try {

            String host;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Adresse eingeben mitder  verbunden werden soll:"); 

            host= reader.readLine();

            Registry registry = LocateRegistry.getRegistry(host,1099);
            Ant a = (Ant) registry.lookup("antwort");


            System.out.println("Frage eingeben:");

            String enter= reader.readLine();

            a.Antwort(enter,this);

        } catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println("Client beendet!");
    }

    public void Ausgeben(String antwort){

        System.out.println("Antwort: "+antwort);

    }

}
