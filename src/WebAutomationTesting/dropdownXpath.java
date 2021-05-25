package WebAutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownXpath {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-hamburger-menu")).click();// click to hamburger menu
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a")).click();// click on bestsellers
	
		//click on ikigai image
		driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-mini')]/img[@alt='Ikigai: The Japanese secret to a long and happy life']")).click();//click to ikigi image
		driver.findElement(By.xpath("//a[@id='a-autoid-12-announce']")).click();  //Click on hardcover price 
		//add to cart button
		driver.findElement(By.id("add-to-cart-button")).click();
		
	}

}
