package october.runner;

import october.categories.PerformanceTests;
import october.tests.MyFirstTest1;
import october.tests.MyFirstTest2;
import october.tests.MyFirstTest3;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(PerformanceTests.class)
@SuiteClasses({MyFirstTest3.class,MyFirstTest1.class,MyFirstTest2.class})

public class PerformanceTestRunner {

}
