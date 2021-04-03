package ro.ase.cts.Clase;

public class FabricaMijlocasi implements FabricaJucatori {
    @Override
    public Jucator creeazaJucatori(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
