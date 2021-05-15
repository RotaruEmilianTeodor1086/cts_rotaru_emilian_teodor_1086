package ro.ase.cts.proxy.clase;

public class ManagerRezervari implements OperatorRezervare {
    private String numeLocal;

    public ManagerRezervari(String numeLocal) {
        this.numeLocal = numeLocal;
    }

    public String getNumeLocal() {
        return numeLocal;
    }

    public void setNumeLocal(String numeLocal) {
        this.numeLocal = numeLocal;
    }

    @Override
    public void rezerva(int nrPersoane) {
        System.out.println("A fost realizata o rezervare la restaurantul " + this.numeLocal + " pentru " + nrPersoane + " persoane");
    }
}
