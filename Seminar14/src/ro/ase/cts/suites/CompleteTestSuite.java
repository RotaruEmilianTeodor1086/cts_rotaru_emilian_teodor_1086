package ro.ase.cts.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.tests.GrupaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTest.class})
public class CompleteTestSuite {

}
