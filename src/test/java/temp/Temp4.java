package temp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Temp4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='search']//button")));
		WebElement txtSearch = driver.findElement(By.name("search"));
		js.executeScript("arguments[0].value='Nikon';", txtSearch);

		WebElement btnSearch = driver.findElement(By.xpath("//div[@id='search']//button"));
		js.executeScript("arguments[0].click();", btnSearch);

		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='product-thumb']/descendant::button[1]")));
		WebElement btnAddToCart = driver.findElement(By.xpath("//div[@class='product-thumb']/descendant::button[1]"));
		js.executeScript("arguments[0].scrollIntoView(true);", btnAddToCart);
		Thread.sleep(10000);
		js.executeScript("arguments[0].click();", btnAddToCart);

	}

}
