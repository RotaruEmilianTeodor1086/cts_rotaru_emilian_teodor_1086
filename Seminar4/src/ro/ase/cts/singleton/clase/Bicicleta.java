package ro.ase.cts.singleton.clase;

//facuta pentru exemplu
public class Bicicleta {
    private String modelBicicleta;
    private String serieBicileta;
    private int kmParcursi;

    private static Bicicleta bicicleta = null;

    public static synchronized Bicicleta getInstance(String modelBicicleta, String serieBicileta, int kmParcursi){
        if(bicicleta==null){
            bicicleta = new Bicicleta(modelBicicleta, serieBicileta, kmParcursi);
        }
        return bicicleta;
    }

    private Bicicleta() {
        this.modelBicicleta = "";
        this.serieBicileta = "";
        this.kmParcursi = 0;
    }

    private Bicicleta(String modelBicicleta, String serieBicileta, int kmParcursi) {
        this.modelBicicleta = modelBicicleta;
        this.serieBicileta = serieBicileta;
        this.kmParcursi = kmParcursi;
    }

    public String getModelBicicleta() {
        return modelBicicleta;
    }

    public void setModelBicicleta(String modelBicicleta) {
        this.modelBicicleta = modelBicicleta;
    }

    public String getSerieBicileta() {
        return serieBicileta;
    }

    public void setSerieBicileta(String serieBicileta) {
        this.serieBicileta = serieBicileta;
    }

    public int getKmParcursi() {
        return kmParcursi;
    }

    public void setKmParcursi(int kmParcursi) {
        this.kmParcursi = kmParcursi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicicleta{");
        sb.append("modelBicicleta='").append(modelBicicleta).append('\'');
        sb.append(", serieBicileta='").append(serieBicileta).append('\'');
        sb.append(", kmParcursi=").append(kmParcursi);
        sb.append('}');
        return sb.toString();
    }
}
