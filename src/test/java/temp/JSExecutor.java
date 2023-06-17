package temp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.automationtesting.in/my-account/");

		WebElement txtUsername = driver.findElement(By.id("username"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.name("login"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='bhargav@gmail.com';arguments[1].value='bhargav@123';arguments[2].click();", txtUsername,txtPassword,btnLogin);
//		js.executeScript("arguments[0].value='bhargav@123';", txtPassword);
//		js.executeScript("arguments[0].click();", btnLogin);

//		Thread.sleep(10000);
//		driver.findElement(By.linkText("Test Cases")).click();
//		Thread.sleep(10000);
//		WebElement headerShop = driver.findElement(By.xpath("//h3[text()='SHOP']"));
//		js.executeScript("arguments[0].scrollIntoView(true);", headerShop);

//		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//		WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='bhargav@123';", txtBox);
//		txtBox.sendKeys("Testing");
	}

}
