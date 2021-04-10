package ro.ase.cts.Adapter.Clase;

public class AdapterLeasing implements Creditable {
    private Leasing leasing;

    public AdapterLeasing(Leasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void crediteaza() {
        this.leasing.oferaLeasing();
    }
}
