package temp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// Milk basket
//		driver.get("https://www.milkbasket.com/");
//
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("pageloader")));
//		
//		driver.findElement(By.xpath("//a[@href='#how-it-works']")).click();

		// 2nd scenario
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.xpath("//div[@class='example']/descendant::input[1]"));

		driver.findElement(By.xpath("//div[@class='example']/descendant::button[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add123']")));
		System.out.println(driver.findElement(By.xpath("//button[text()='Add']")).isDisplayed());

	}

}
