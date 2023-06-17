package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.selenium.dev");

//		// Open page in new tab
//		WebElement link = driver.findElement(By.xpath("//span[text()='Downloads']"));
		Actions actions = new Actions(driver);
//		actions.keyDown(Keys.CONTROL).moveToElement(link).click().keyUp(Keys.CONTROL).perform();

		// SendKeys
//		driver.findElement(By.className("DocSearch-Search-Icon")).click();
//		WebElement textBox = driver.findElement(By.id("docsearch-input"));
//		actions.keyDown(Keys.SHIFT).sendKeys("Test").keyUp(Keys.SHIFT).sendKeys("done").perform();

//		actions.keyDown(Keys.CONTROL).keyDown(Keys.END).perform();

		// Double click
//		driver.get("https://artoftesting.com/samplesiteforselenium");
//		WebElement dblCkickBtn = driver.findElement(By.id("dblClkBtn"));
//		actions.moveToElement(dblCkickBtn).doubleClick().perform();

		// Mouse hover
//		driver.get("https://www.browserstack.com/");
//		WebElement menu = driver.findElement(By.id("developers-menu-toggle"));
//		actions.moveToElement(menu).perform();
//		driver.findElement(By.linkText("Events")).click();

		// drag drop
//		driver.get("https://jqueryui.com/droppable/");
//		Thread.sleep(2000);
//		driver.switchTo().frame(0);
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droppable"));
////		actions.dragAndDrop(source, target).perform();
//		actions.clickAndHold(source).moveToElement(target).release().perform();

		driver.get("https://www.selenium.dev");
		WebElement element = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));

		Point location = element.getLocation();
		actions.scrollByAmount(location.x, location.y).perform();

	}

}
