package ro.ase.cts.Clase;

public class FabricaFundas implements FabricaJucatori {
    @Override
    public Jucator creeazaJucatori(String nume, int nrTricou) {
        return new Fundas(nume, nrTricou);
    }
}
