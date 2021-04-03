package ro.ase.cts.Program;

import ro.ase.cts.Clase.*;

public class Main {

    public static void afiseazaInformatiiJucator(FabricaJucatori fabrica, String nume, int nrTricou){
        Jucator jucator = fabrica.creeazaJucatori(nume, nrTricou);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afiseazaInformatiiJucator(new FabricaAtacant(), "Popescu", 15);
        afiseazaInformatiiJucator(new FabricaPortar(), "Ionescu", 17);
        afiseazaInformatiiJucator(new FabricaMijlocasi(), "Georgescu", 11);

        System.out.println("---------------------");

        Rezervare rezervare = new Rezervare(12, false,true, false, true, "pop");
        BuilderRezervare builderRezervare = new BuilderRezervare().setAremancareInclusa(true).setAreMuzicaAmbientalaPersonalizata(true).setGenMuzical("Pop");
        Rezervare rezervare1 = builderRezervare.build();

        Rezervare rezervare2 = new BuilderRezervare().setCodRezervare(2).setAreScaunErgonomic(true).build();
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

        Rezervare rezervare3 = new BuilderRezervare().setCodRezervare(3).setGenMuzical("Rock").setAreScaunErgonomic(true).build();
        System.out.println(rezervare3.toString());

        Rezervare rezervare4 = builderRezervare.setCodRezervare(4).build();

        BuilderRezervare2 builderRezervare2 = new BuilderRezervare2().setAremancareInclusa(true).setAreScaunErgonomic(true).setAreBauturaRacoritoareInclusa(true);
        Rezervare rezervare5 = builderRezervare2.setCodRezervare(10).build();
        Rezervare rezervare6 = builderRezervare2.setCodRezervare(11).build();
        System.out.println(rezervare5.toString());
        System.out.println(rezervare6.toString());
    }


}
