package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    // E o coada
    private List<ComandaAbstracta> listaComenzi = new ArrayList<>();

    public void adaugaComanda(ComandaAbstracta comanda) {
        this.listaComenzi.add(comanda);
    }

    public void executaComanda(){
        if (listaComenzi.size() != 0) {
            this.listaComenzi.get(0).executa();
            this.listaComenzi.remove(0);
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }
}
