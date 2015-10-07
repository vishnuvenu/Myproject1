package october.tests;

import october.categories.SmokeTests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SmokeTests.class)

public class MyFirstTest2  {
	
	@Test

	public void MyTest1()
	{
		
		System.out.println("this is first test1 from MyFirstTest2");
	}

}