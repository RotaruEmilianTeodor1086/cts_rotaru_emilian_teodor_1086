package ro.ase.cts.Program;

import ro.ase.cts.Clase.Facade;
import ro.ase.cts.Clase.Masa;

public class Main {
    public static void main(String[] args) {
//        Masa masa1 = new Masa(30, 10);
//        if(OperatorMese.esteLibera(masa1.getNrMasa())) {
//            Picolo picolo1 = new Picolo("Gigel");
//            if(picolo1.esteDebarasata(masa1.getNrMasa())) {
//                if(picolo1.esteAranjata(masa1.getNrMasa())){
//                    System.out.println("Poftiti va rog la masa");
//                } else {
//                    System.out.println("Va rog mai asteptati");
//                }
//            } else {
//                System.out.println("Va rog mai asteptati");
//            }
//        } else {
//            System.out.println("Va rog mai asteptati");
//        }

        if(Facade.esteMasaPregatita(new Masa(30, 4))){
            System.out.println("Poftiti va rog la masa");
        } else {
            System.out.println("Va rog mai asteptati");
        }

    }
}
