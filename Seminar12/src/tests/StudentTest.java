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

    @Test
    public void testGetNota() {
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);
        student.adaugaNota(9);
        student.adaugaNota(4);
        assertEquals(9, student.getNota(2));
    }

    @Test
    public void testAdaugaOSinguraNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(1, student.getNote().size());
    }

    @Test
    public void testAdaugaNotaIncorectaJUnit3() {
        Student student = new Student();
//1
        try {
            //2
            student.adaugaNota(-1);
            //3 - nu ajunge aici
            fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptii");
        } catch (IllegalArgumentException ex) {
            //4
        } catch (Exception e) {
            //5 - nu ajunge aici
            fail("Nu arunca o exceptie de tipul IllegalArgument");
        }
        //6
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdaugaNotaIncorectaJUnit4() {
        Student student = new Student();
        student.adaugaNota(-1);
    }

    @Test
    public void testStudentulAreRestanta() {
        Student student = new Student();
        student.adaugaNota(3);
        boolean rezultat = student.areRestante();
        assertTrue(rezultat);
    }

    @Test
    public void testStudentulNuAreRestanta() {
        Student student = new Student();
        student.adaugaNota(6);
        boolean rezultat = student.areRestante();
        assertFalse(rezultat);
    }

    @Test
    public void testCalculeazaMedieCorecta() {
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        //nu putem folosi pt assertEquals pt valori reale e deprecated
//        assertEquals(9.5, student.calculeazaMedie());
        assertEquals(9.5, student.calculeazaMedie(), 0.001);
    }
}