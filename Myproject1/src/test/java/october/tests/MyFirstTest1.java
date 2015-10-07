package october.tests;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import october.Libs.OctLibs;
import october.categories.PerformanceTests;
import october.categories.SmokeTests;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;


public class MyFirstTest1  {
	
	//static Logger log= Logger.getRootLogger();
	static Logger log =Logger.getLogger(MyFirstTest1.class);
	private WebDriver driver = OctLibs.getBrowser("internetexplorer");
	WebDriverWait wait = new WebDriverWait(driver,100);
	
	@Category(SmokeTests.class)
	@Test
	public void MyTest1()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Log4j levels");
		log.debug("debug");
		log.info("info");
		log.warn("warm");
		log.error("error");
		log.fatal("fatal");
		
	
		driver.get("http://www.pega.com/");
		log.info("element visible");
		driver.close();
		
	
	}
	@Category(PerformanceTests.class)
	@Test
	public void MyTest2()
	{
		
		System.out.println("this is first test2 from MyFirstTest1");
	}

}
