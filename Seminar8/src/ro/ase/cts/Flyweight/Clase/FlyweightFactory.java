package ro.ase.cts.Flyweight.Clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, FlyweightAbstract> clienti;

    public FlyweightFactory() {
        this.clienti = new HashMap<>();
    }

    public FlyweightAbstract getClient(String nrTelefon){
        FlyweightAbstract client = clienti.get(nrTelefon);
        if (client == null) {
            client = new Client ("Gigel", nrTelefon, "gigel.com");
            clienti.put(nrTelefon, client);
        }
        return client;
    }
}
