package ro.ase.cts.Program;

import ro.ase.cts.Clase.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> solutii = new ArrayList<>();
        solutii.add("apa");
        List<Integer> cantitati = new ArrayList<>();
        cantitati.add(10);

        Reteta reteta1 = new Reteta(solutii, cantitati);
        Reteta reteta2 = (Reteta) reteta1.copiaza();
        System.out.println(reteta1);
        System.out.println(reteta2);
        System.out.println("----------------------------");
    }
}
