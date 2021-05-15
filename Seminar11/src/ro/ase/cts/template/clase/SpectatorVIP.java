package ro.ase.cts.template.clase;

public class SpectatorVIP extends Template{
    private String nume;
    private int nrLoja;

    public SpectatorVIP(String nume, int nrLoja) {
        this.nume = nume;
        this.nrLoja = nrLoja;
    }

    @Override
    public void seAseazaLaCoada() {

    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume + " prezinta biletul VIP");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println("Se face controlul corportal pentru " + this.nume);
    }

    @Override
    public void seOcupaLoc() {
        System.out.println(this.nume + " ocupa loc in loja " + this.nrLoja);
    }
}
