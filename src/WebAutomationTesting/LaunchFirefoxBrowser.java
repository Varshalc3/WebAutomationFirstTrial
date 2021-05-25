package WebAutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.*;
import java.lang.*;


public class LaunchFirefoxBrowser
{
	
  public static void  main(String[] args)
   {
	  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
	 
	  String url=("http://www.google.com");
	  driver.get(url);
	
	  
   }
}