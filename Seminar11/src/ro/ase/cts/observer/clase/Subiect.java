package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer> listaObserveri = null;

    public Subiect() {
        this.listaObserveri = new ArrayList<>();
    }

    public void adaugareAbonat(Observer observer) {
        this.listaObserveri.add(observer);
    }

    public void stergereAbonat(Observer observer) {
        this.listaObserveri.remove(observer);
    }

    public void trimiteNotificare(String mesaj) {
        for (Observer obs: listaObserveri) {
            obs.receptionareMesaj(mesaj);
        }
    }
}
