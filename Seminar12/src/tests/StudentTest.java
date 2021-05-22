package tests;

import clase.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testConstructorWorksCorrectlyForName() {
        String nume = "Gigel";
        Student student = new Student(nume);

//        Am comentat fiindca e echivalent cu codul de jos (assertEquals)
//        if(nume.equals(student.getNume())) {
//            System.out.println("e in regula");
//        } else {
//            System.out.println("Constructorul nu initializeaza numele corect");
//        }

        assertEquals(nume, student.getNume());
    }

    @Test
    public void setNume() {
        String nume = "Popescu";
        Student student = new Student();
        student.setNume(nume);

        assertEquals(nume, student.getNume());
    }

    @Test
    public void testDefaultConstructorWorksCorrectly() {
        Student student = new Student();

//        Am comentat fiindca, desi functionau la fel, in contextul acesta e mai buna a doua asertie (assertNotNull)
//        assertNotEquals(null, student.getNote());
        assertNotNull("Lista de note nu a fost initializata",student.getNote());
        assertNotNull("Numele nu a fost initializat", student.getNume());
    }

    @Test
    public void adaugaNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
    }
}