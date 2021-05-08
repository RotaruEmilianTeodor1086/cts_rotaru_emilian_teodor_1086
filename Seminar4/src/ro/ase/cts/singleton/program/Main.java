package ro.ase.cts.singleton.program;

import ro.ase.cts.singleton.clase.Bicicleta;
import ro.ase.cts.singleton.clase.Arbore;
import ro.ase.cts.singleton.clase.Parlament;
import ro.ase.cts.singleton.clase.ParlamentLazy;

public class Main {
    public static void main(String[] args) {

        Parlament parlament1 = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();

        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("------------------");
        parlament1.setTara("Romania");
        parlament2.setNrParlamentari(300);
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());

        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Serbia", 400, 8, "Sediul Serbiei");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("UK", 500, 2, "Sediul UK");

        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());

        Arbore arbore1 = Arbore.getInstance("Sequia", 22, 40.4);
        Arbore arbore2 = Arbore.getInstance("Mar", 30, 40.2);

        System.out.println(arbore1.toString());
        System.out.println(arbore2.toString());

        System.out.println("------------------");

        //facut acasa - pt exemplificare

        Bicicleta bicicleta1 = Bicicleta.getInstance("BMX", "234VN", 20);
        Bicicleta bicicleta2 = Bicicleta.getInstance("Trade", "476BUC", 45);

        System.out.println(bicicleta1.toString());
        System.out.println(bicicleta2.toString());
    }
}
