package october.Libs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OctLibs {
	
	
	public static WebDriver getBrowser(String browser)
	{	
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			ProfilesIni p = new ProfilesIni();
			FirefoxProfile fp = p.getProfile("selenium");
			
			
		driver= new FirefoxDriver(fp);
		
		}
		
		if(browser.equalsIgnoreCase("internetExplorer"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\sel\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		
		}
		
		
		
		return driver;
		
	}

}
