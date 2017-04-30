
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) {        //Client
        try {

            String host;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("IP-Adresse eingeben:");

            host= reader.readLine();

            Registry registry = LocateRegistry.getRegistry(host,1099);
            Quadrat h = (Quadrat) registry.lookup("test");

            System.out.println("Zahl eingeben, aus welcher das Quadrat berechnet werden soll:");
            String enter= reader.readLine();

            long res = h.quadrat(Integer.parseInt(enter));

            System.out.println("Ergebnis: "+res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}