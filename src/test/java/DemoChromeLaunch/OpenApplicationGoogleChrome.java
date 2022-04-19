package DemoChromeLaunch;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class OpenApplicationGoogleChrome {

		
		
			
			 WebDriver driver;
				
				@BeforeTest
				public void configureBrowser()
				{
					
					
					driver=DemoUtility.GetDrivers("chrome");
					driver.manage().window().maximize();
				}
				
				public void OpenGoogleAppChromeBrowser() throws InterruptedException
				{
					Thread.sleep(3000);
					driver.get("http://google.com");
					Thread.sleep(3000);
				}
				
				@AfterTest
				public void closeApll()
				{
					driver.close();
				}

			

	}


