package temp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Temp3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		// Javascript enter text
		WebElement txtUsername = driver.findElement(By.id("username"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].value='bhargav@gmail.com';", txtUsername);
		js.executeScript("arguments[0].value='bhargav@123';", txtPassword);
		
		// Javascript click
		WebElement btnLogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();", btnLogin);
		
		driver.findElement(By.linkText("Test Cases")).click();
		
		// Javascript scroll to element
		WebElement header = driver.findElement(By.xpath("//h3[text()='MY ACCOUNT - REGISTRATION']"));
		js.executeScript("arguments[0].scrollIntoView(true);", header);
		
//		// Write in disabled textbox
//		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		WebElement txtBox = driver.findElement(By.xpath("//form[@id='input-example']//input"));
//		
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='testing';", txtBox);
	}

}
