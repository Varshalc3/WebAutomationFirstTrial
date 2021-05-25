package WebAutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.lang.*;


public class LaunchChromeBrowser
{
	
  public static void  main(String[] args)
   {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver90.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().fullscreen();
	  driver.get("http://www.amazon.com/");
	 //  driver.navigate().to("www.google.com");
	  String Title=driver.getTitle();
	  

	  
   }

}