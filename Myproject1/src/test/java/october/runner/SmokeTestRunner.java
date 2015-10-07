package october.runner;

import october.categories.SmokeTests;
import october.tests.MyFirstTest1;
import october.tests.MyFirstTest2;
import october.tests.MyFirstTest3;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Categories.class)
@IncludeCategory(SmokeTests.class)
@SuiteClasses({MyFirstTest1.class,MyFirstTest2.class,MyFirstTest3.class})

public class SmokeTestRunner {

}
