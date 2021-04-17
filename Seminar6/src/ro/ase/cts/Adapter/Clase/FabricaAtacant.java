package ro.ase.cts.Adapter.Clase;

public class FabricaAtacant implements FabricaJucatori {
    @Override
    public Jucator creeazaJucatori(String nume, int nrTricou) {
        return new Atacant(nume, nrTricou);
    }
}