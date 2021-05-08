package ro.ase.cts.singleton.clase;

//Rotaru Emilian-Teodor, litere: R, E
public class Arbore {
    private String denumireArbore;
    private int varstaArbore;
    private double coordonateLocatieArbore;

    private static Arbore arbore = null;

    public static synchronized Arbore getInstance(String denumireArbore, int varstaArbore, double coordonateLocatieArbore){
        if(arbore==null){
            arbore = new Arbore(denumireArbore, varstaArbore, coordonateLocatieArbore);
        }
        return arbore;
    }

    private Arbore() {
        this.denumireArbore = "";
        this.varstaArbore = 0;
        this.coordonateLocatieArbore = 0;
    }

    private Arbore(String denumireArbore, int varstaArbore, double coordonateLocatieArbore) {
        this.denumireArbore = denumireArbore;
        this.varstaArbore = varstaArbore;
        this.coordonateLocatieArbore = coordonateLocatieArbore;
    }

    public String getDenumireArbore() {
        return denumireArbore;
    }

    public void setDenumireArbore(String denumireArbore) {
        this.denumireArbore = denumireArbore;
    }

    public int getVarstaArbore() {
        return varstaArbore;
    }

    public void setVarstaArbore(int varstaArbore) {
        this.varstaArbore = varstaArbore;
    }

    public double getCoordonateLocatieArbore() {
        return coordonateLocatieArbore;
    }

    public void setCoordonateLocatieArbore(float coordonateLocatieArbore) {
        this.coordonateLocatieArbore = coordonateLocatieArbore;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Arbore{");
        sb.append("denumireArbore='").append(denumireArbore).append('\'');
        sb.append(", varstaArbore=").append(varstaArbore);
        sb.append(", coordonateLocatieArbore=").append(coordonateLocatieArbore);
        sb.append('}');
        return sb.toString();
    }
}
