package WebAutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG2
{
	@Test
	public void launchChrome()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().fullscreen();
		  driver.get("http://www.amazon.com/");
		 //  driver.navigate().to("www.google.com");
		  String Title=driver.getTitle();
		  
	}
	

}
