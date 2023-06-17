package temp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

		By text = By.xpath("//form[@id='input-example']//input");

		FluentWait<WebDriver> wait = new FluentWait<>(driver);
		wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(1));

		driver.findElement(By.xpath("//form[@id='input-example']//button")).click();

		wait.until(ExpectedConditions.elementToBeClickable(text)).sendKeys("Testing");

	}

}
