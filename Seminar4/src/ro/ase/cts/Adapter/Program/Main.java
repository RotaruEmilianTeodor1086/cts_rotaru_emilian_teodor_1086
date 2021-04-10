package ro.ase.cts.Adapter.Program;

import ro.ase.cts.Adapter.Clase.Arbore;
import ro.ase.cts.Adapter.Clase.Parlament;
import ro.ase.cts.Adapter.Clase.ParlamentLazy;

public class Main {
    public static void main(String[] args) {
//        Parlament parlament1 = new Parlament("Romania", 123, 4, "Undeva");
//        Parlament parlament2 = new Parlament("Bulgaria", 456, 14, "In Bulgaria");

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
    }
}
