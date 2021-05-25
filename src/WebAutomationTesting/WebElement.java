package WebAutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.amazon.in");
		
		//find webelement of flipkart
	/*	driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).sendKeys("varshalc3@gmail.com"); //username
		driver.findElement(By.xpath("//span[text()='Enter Password']")).sendKeys("123"); //password
		driver.findElement(By.xpath("//button[@type='submit']")).click(); //login  */
		
		// Find Web element of amazon
		driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click(); //sign in

	//	driver.findElement(By.xpath("//input[@id='ap_email']")).click();  //sign in button
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("varshalc3@gmail.com"); //username
		driver.findElement(By.xpath("//input[@id='continue']")).click(); //click to continue
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Varshal@123");		//password
		
		//driver.findElement(By.xpath("//input[@id='signInSubmit']")).click(); //sign in
		driver.findElement(By.className("a-button-input")).click();
		
		//Click to check orders 
		driver.findElement(By.xpath("//a/span[text()='Your Orders']")).click();
		
		//driver.findElement(By.xpath("//span[@class='nav-shortened-name']")).click();
		driver.findElement(By.xpath("//a[@id='nav-link-prime']")).click(); //click on prime menu
		
	}

}
