package ro.ase.cts.template.clase;

public abstract class Template {

    public final void intraPeStadion(){
        seAseazaLaCoada();
        prezintaBilet();
        seFaceControlCorporal();
        seOcupaLoc();
    }

    public abstract void seAseazaLaCoada();
    public abstract void prezintaBilet();
    public abstract void seFaceControlCorporal();
    public abstract void seOcupaLoc();
}
