package DemoChromeLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementLocator {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\eclipse-workspace\\WorkArtifactdemo\\Drivers\\chromedriver.exe" );



driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/swath/Desktop/selenium%20with%20java/test1.html");

Thread.sleep (2000);
 WebElement user=driver.findElement(By.id("username"));
 user.sendKeys("Swathi");
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	WebElement passwordBox=driver.findElement(By.name("userpass"));
	passwordBox.sendKeys("Password@123");
	
	Thread.sleep(2000);
	driver.close();
	}

}
