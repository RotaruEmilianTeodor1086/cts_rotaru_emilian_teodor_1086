package ro.ase.cts.chainOfResponsibility.program;

import ro.ase.cts.chainOfResponsibility.clase.Cont;
import ro.ase.cts.chainOfResponsibility.clase.ContCredit;
import ro.ase.cts.chainOfResponsibility.clase.ContCurent;
import ro.ase.cts.chainOfResponsibility.clase.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCurent(200);
        Cont contCredit = new ContCredit(150);
        Cont contEconomii = new ContEconomii(150);

        contCurent.setSuccesorCont(contCredit);
        contCredit.setSuccesorCont(contEconomii);

        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(150);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);
    }
}
