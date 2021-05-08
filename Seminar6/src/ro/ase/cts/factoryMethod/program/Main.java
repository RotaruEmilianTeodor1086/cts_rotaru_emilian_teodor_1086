package ro.ase.cts.factoryMethod.program;

import ro.ase.cts.factoryMethod.clase.*;

public class Main {

    public static void afiseazaInformatiiJucator(FabricaJucatori fabrica, String nume, int nrTricou){
        Jucator jucator = fabrica.creeazaJucatori(nume, nrTricou);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afiseazaInformatiiJucator(new FabricaAtacant(), "Popescu", 15);
        afiseazaInformatiiJucator(new FabricaPortar(), "Ionescu", 17);
        afiseazaInformatiiJucator(new FabricaMijlocasi(), "Georgescu", 11);
    }

}
