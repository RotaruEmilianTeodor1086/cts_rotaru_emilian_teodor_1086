package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.StudentFake;

import static org.junit.Assert.*;

public class StudentFakeTest {

    @Test
    public void testGetPromovabilitate() {
        Grupa grupa = new Grupa(1086);
        for(int i=0;i<7;i++) {
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestante(false);
            grupa.adaugaStudent(studentFake);
        }
        for(int i=0;i<3;i++) {
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestante(false);
            grupa.adaugaStudent(studentFake);
        }

        assertEquals(0.7, grupa.getPromovabilitate(), 0.001);
    }
}