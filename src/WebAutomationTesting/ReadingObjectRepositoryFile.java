package WebAutomationTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingObjectRepositoryFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		File location= new File("D:\\Test\\WebAutomation\\ObjectRepository\\objectRepository.properties");
		
		FileInputStream loadFile=new FileInputStream(location); //To load the file
		
		Properties readObj=new Properties();
		readObj.load(loadFile); // to read the object in file
		
		//
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com");
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(readObj.getProperty("search"))).sendKeys("Books");
		driver.findElement(By.xpath(readObj.getProperty("clickSearch"))).click();
		
		
		
	}

}
