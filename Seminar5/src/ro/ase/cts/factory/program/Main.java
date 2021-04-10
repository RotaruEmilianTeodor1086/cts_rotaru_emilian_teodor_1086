package ro.ase.cts.factory.program;

import ro.ase.cts.Adapter.Clase.FactorySingleton;
import ro.ase.cts.factory.clase.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        PersonalMedical medic1 = factory.create(TipPersonal.MEDIC, "Ionescu", 5000);
        PersonalMedical asistent1 = factory.create(TipPersonal.ASISTENT, "Popescu", 2000);
        PersonalMedical brancardier1 = factory.create(TipPersonal.BRANCARDIER, "Marinescu", 3000);

        System.out.println(medic1);
        System.out.println(asistent1);
        System.out.println(brancardier1);

        PersonalMedical medic2 = FactorySingleton.getInstance().create(TipPersonal.MEDIC, "Petrica", 12345);
        System.out.println(medic2);
    }
}
