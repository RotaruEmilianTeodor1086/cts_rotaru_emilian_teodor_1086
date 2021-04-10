package ro.ase.cts.Adapter.Clase;

public class BuilderRezervare2 implements AbstractBuilder{
    private int codRezervare;
    private boolean aremancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzical;

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare,aremancareInclusa,areScaunErgonomic,areBauturaRacoritoareInclusa,areMuzicaAmbientalaPersonalizata,genMuzical);
    }

    public BuilderRezervare2() {
        codRezervare = 1000;
        genMuzical = "Pop";
    }

    public BuilderRezervare2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public BuilderRezervare2 setAremancareInclusa(boolean aremancareInclusa) {
        this.aremancareInclusa = aremancareInclusa;
        return this;
    }

    public BuilderRezervare2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public BuilderRezervare2 setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        return this;
    }

    public BuilderRezervare2 setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        return this;
    }

    public BuilderRezervare2 setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }
}
