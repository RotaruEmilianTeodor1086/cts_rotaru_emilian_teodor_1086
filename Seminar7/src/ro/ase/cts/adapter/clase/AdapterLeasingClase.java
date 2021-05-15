package ro.ase.cts.adapter.clase;

public class AdapterLeasingClase extends Leasing implements Creditable{

    public AdapterLeasingClase(String numeClient, int suma) {
        super(numeClient, suma);
    }

    @Override
    public void crediteaza() {
        super.oferaLeasing();
    }

}
