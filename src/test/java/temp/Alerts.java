package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		// Info alert
//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();

		// Confirmation alert
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		
		
		// Prompt alert
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Testing");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

}
