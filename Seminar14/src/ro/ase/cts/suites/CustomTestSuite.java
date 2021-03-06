package ro.ase.cts.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.clase.categories.TesteRight;
import ro.ase.cts.clase.categories.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses({CompleteTestSuite.class}) //nerecomandat
@Categories.IncludeCategory({TesteUrgente.class})
@Categories.ExcludeCategory ({TesteRight.class})
public class CustomTestSuite {

}
