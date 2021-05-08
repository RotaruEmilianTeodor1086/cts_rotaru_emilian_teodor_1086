package ro.ase.cts.simpleFactory.clase;

public class Asistent extends PersonalMedical{

    public Asistent(String nume, float salariu){
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }

}
