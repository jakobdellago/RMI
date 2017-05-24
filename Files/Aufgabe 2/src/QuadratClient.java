/**
 * Created by stdeljak on 21.03.2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class QuadratClient {

    public static void main(String[] args) {       
        try {

            String host;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Adresse eingeben mitder  verbunden werden soll:");

            host= reader.readLine();

            Registry registry = LocateRegistry.getRegistry(host,1099);
            Quadrat h = (Quadrat) registry.lookup("test");


            System.out.println("Zu berechnende Zahl eingeben:");
            String enter= reader.readLine();

            long res = h.quadrat(Integer.parseInt(enter));

            System.out.println("Ergebnis: "+res);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
