package ro.ase.cts.Clase;

public class Facade {
    public static boolean esteMasaPregatita(Masa masa) {
        if(OperatorMese.esteLibera(masa.getNrMasa())) {
            Picolo picolo1 = new Picolo("Gigel");
            if (picolo1.esteDebarasata(masa.getNrMasa())) {
                if (picolo1.esteAranjata(masa.getNrMasa())) {
                    return true;
                }
            }
        }
        return false;
    }
}
