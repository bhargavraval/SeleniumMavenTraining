package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);

		driver.switchTo().frame("singleframe");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing");
		Thread.sleep(5000);

		driver.switchTo().parentFrame();

		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		Thread.sleep(2000);

		WebElement parentFrame = driver.findElement(By.xpath("//div[@id='Multiple']/child::iframe"));
		driver.switchTo().frame(parentFrame);
		WebElement childFrame = driver.findElement(By.xpath("//div[@class='iframe-container']/child::iframe"));
		driver.switchTo().frame(childFrame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Multi frame Testing");
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Single")).click();
		Thread.sleep(2000);

		driver.quit();

	}

}
