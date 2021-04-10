package ro.ase.cts.Adapter.Clase;

public class Rezervare {
    private int codRezervare;
    private boolean aremancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzical;

    public Rezervare(int codRezervare, boolean aremancareInclusa, boolean areScaunErgonomic, boolean areBauturaRacoritoareInclusa, boolean areMuzicaAmbientalaPersonalizata, String genMuzical) {
        this.codRezervare = codRezervare;
        this.aremancareInclusa = aremancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        this.genMuzical = genMuzical;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAremancareInclusa(boolean aremancareInclusa) {
        this.aremancareInclusa = aremancareInclusa;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
    }

    public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", aremancareInclusa=").append(aremancareInclusa);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBauturaRacoritoareInclusa=").append(areBauturaRacoritoareInclusa);
        sb.append(", areMuzicaAmbientalaPersonalizata=").append(areMuzicaAmbientalaPersonalizata);
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
