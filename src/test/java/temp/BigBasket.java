package temp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasket {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.bigbasket.com/");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@qa='supportNumber']")));

		WebElement navMenu = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(navMenu).perform();
		driver.findElement(By.xpath("//div[@id='navbar']//a[text()='Fruits & Vegetables']")).click();

		By productGrid = By.xpath("//div[@class='tab-content']//div[@class='items']");

		wait.until(ExpectedConditions.visibilityOfElementLocated(productGrid));

		By count = By.xpath("//h2[@qa='pageName']");
		System.out.println(driver.findElement(count).getText());
		driver.findElement(By.xpath("//span[text()='Seasonal']/parent::h4/following-sibling::div[1]")).click();

		By loader = By.className("pd-overlay");

		wait.until(ExpectedConditions.attributeToBe(loader, "style", "display: none;"));
		System.out.println(driver.findElement(count).getText());
	}

}
