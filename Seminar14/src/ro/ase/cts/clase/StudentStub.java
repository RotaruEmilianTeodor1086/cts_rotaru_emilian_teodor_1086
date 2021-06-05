package ro.ase.cts.clase;

import java.util.List;

public class StudentStub implements IStudent{
    @Override
    public String getNume() {
        return "Emilian";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 10;
    }

    @Override
    public int getNota(int index) {
        return 9;
    }

    @Override
    public boolean areRestante() {
        return true;
    }
}
