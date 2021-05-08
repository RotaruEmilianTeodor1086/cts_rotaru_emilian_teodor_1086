package ro.ase.cts.factoryMethod.clase;

public class FabricaMijlocasi implements FabricaJucatori {
    @Override
    public Jucator creeazaJucatori(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
