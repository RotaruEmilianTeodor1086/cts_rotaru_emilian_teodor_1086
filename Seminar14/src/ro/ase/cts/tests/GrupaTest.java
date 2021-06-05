package ro.ase.cts.tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mock.StudentDummy;

import static org.junit.Assert.*;

public class GrupaTest {
    private static Grupa grupa;

    @Test
    public void testConstructorRight() {
        Grupa grupa = new Grupa(1086);
        assertEquals(1086, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaInferioara() {
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaSuperioara() {
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorExceptie() {
        assertThrows(IllegalArgumentException.class, () -> {new Grupa(900);});
    }

    @Test
    public void testConstructorExceptie2() {
        assertThrows(IllegalArgumentException.class, () -> {new Grupa(1200);});
    }

//    @Test(timeout = 500)
    public void testConstructorPerformance() {
        Grupa grupa = new Grupa(1086);
    }

    @Test
    public void testConstructorRange() {
        Grupa grupa = new Grupa(1001);
        assertEquals(1001, grupa.getNrGrupa());
        Grupa grupa2 = new Grupa(1099);
        assertEquals(1099, grupa2.getNrGrupa());
    }

    @Test
    public void testConstructorExistance() {
        Grupa grupa = new Grupa(1041);
        assertNotNull(grupa.getStudenti());
    }

    //Teste Seminar 14 - cu mockuri
    @Test
    public void adaugaStudent() {
        Grupa grupa = new Grupa(1086);
        StudentDummy studentDummy = new StudentDummy();

        grupa.adaugaStudent(studentDummy);
        assertEquals(1, grupa.getStudenti().size());
    }

    @Test
    public void adaugaStudentBoundarySuperior() {
        Grupa grupa = new Grupa(1086);

        for(int i=0; i<35; i++) {
            StudentDummy studentDummy = new StudentDummy();
            grupa.adaugaStudent(studentDummy);
        }
        assertEquals(35, grupa.getStudenti().size());
    }

    @BeforeClass
    public static void creareGrupa() {
        grupa = new Grupa(1086);
        for(int i=0; i<35; i++) {
            StudentDummy studentDummy = new StudentDummy();
            grupa.adaugaStudent(studentDummy);
        }
    }

//    @Test (expected = IllegalArgumentException.class)
//    public void adaugaStudentExceptie() {
//        StudentDummy studentDummy = new StudentDummy();
//        grupa.adaugaStudent(studentDummy);
//    }

}