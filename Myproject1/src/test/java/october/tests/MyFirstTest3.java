package october.tests;

import october.categories.PerformanceTests;
import october.categories.SmokeTests;

import org.junit.Test;
import org.junit.experimental.categories.Category;



public class MyFirstTest3  {
	
	@Test
	@Category(PerformanceTests.class)
	
	public void MyTest1()
	{
		
		System.out.println("this is first test1 from MyFirstTest3");
	}
	@Category({SmokeTests.class,PerformanceTests.class})
	@Test
	public void MyTest2()
	{
		
		System.out.println("this is first test2 from MyFirstTest3");
	}

}