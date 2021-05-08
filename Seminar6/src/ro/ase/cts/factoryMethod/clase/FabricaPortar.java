package ro.ase.cts.factoryMethod.clase;

public class FabricaPortar implements FabricaJucatori {
    @Override
    public Jucator creeazaJucatori(String nume, int nrTricou) {
        return new Portar(nume, nrTricou);
    }
}
