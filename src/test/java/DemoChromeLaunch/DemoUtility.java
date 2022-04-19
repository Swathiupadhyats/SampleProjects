package DemoChromeLaunch;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoUtility {
//	static WebDriver driver;
	//instance variable & Method -Object
	//static variable & Method -classname
	static WebDriver GetDrivers(String driverstr)
	{
		if(driverstr.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty( "webdriver.chrome.driver","C:\\Users\\swath\\eclipse-workspace\\WorkArtifactdemo\\Drivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(driverstr.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\eclipse-workspace\\WorkArtifactdemo\\Drivers\\geckodriver.exe");
return new FirefoxDriver();
		}
		else if(driverstr.equalsIgnoreCase("ie")) 
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\swath\\eclipse-workspace\\WorkArtifactdemo\\Drivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		return null;
	}

}
