package ro.ase.cts.Adapter.Program;

import ro.ase.cts.Adapter.Clase.AdapterLeasing;
import ro.ase.cts.Adapter.Clase.AdapterLeasingClase;
import ro.ase.cts.Adapter.Clase.Creditable;
import ro.ase.cts.Adapter.Clase.Leasing;

public class Main {

    public static void printeazaInformatiiCredit(Creditable credit){
        credit.crediteaza();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Emilian", 10000);
        //printeazaInformatiiCredit(leasing); - o sa dea eroare fiindca nu sunt compatibile clasele, deci e nevoie de adapter

        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);
        adapterLeasing.crediteaza();
        System.out.println("--------------------");
        printeazaInformatiiCredit(adapterLeasing);

        System.out.println("--------------------");

        AdapterLeasingClase adapterLeasingClase = new AdapterLeasingClase("Teodor", 5000);
        printeazaInformatiiCredit(adapterLeasingClase);
    }
}