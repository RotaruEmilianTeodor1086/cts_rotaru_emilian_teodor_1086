package ro.ase.cts.clase;

import java.util.List;

public class StudentFake implements IStudent{
    private String valoareGetNume;
    private List<Integer> valoareGetNote;
    private float valoareCalculeazaMedie;
    private int valoareaGetNota;
    private boolean valoareAreRestante;

    @Override
    public String getNume() {
        return this.valoareGetNume;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return this.valoareGetNote;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return this.valoareCalculeazaMedie;
    }

    @Override
    public int getNota(int index) {
        return valoareGetNote;
    }

    @Override
    public boolean areRestante() {
        return this.valoareAreRestante;
    }

    public void setValoareGetNume(String valoareGetNume) {
        this.valoareGetNume = valoareGetNume;
    }

    public void setValoareGetNote(List<Integer> valoareGetNote) {
        this.valoareGetNote = valoareGetNote;
    }

    public void setValoareCalculeazaMedie(float valoareCalculeazaMedie) {
        this.valoareCalculeazaMedie = valoareCalculeazaMedie;
    }

    public void setValoareaGetNota(int valoareaGetNota) {
        this.valoareaGetNota = valoareaGetNota;
    }

    public void setValoareAreRestante(boolean valoareAreRestante) {
        this.valoareAreRestante = valoareAreRestante;
    }
}
