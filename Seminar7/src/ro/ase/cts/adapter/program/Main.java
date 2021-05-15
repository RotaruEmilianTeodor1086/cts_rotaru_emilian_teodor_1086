package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterLeasing;
import ro.ase.cts.adapter.clase.Leasing;
import ro.ase.cts.adapter.clase.AdapterLeasingClase;
import ro.ase.cts.adapter.clase.Creditable;

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
