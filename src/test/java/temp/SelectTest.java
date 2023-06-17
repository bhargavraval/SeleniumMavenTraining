package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;

public class SelectTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
//		Thread.sleep(2000);
//
//		// Single Select
//		WebElement singleSelectDropDown = driver.findElement(By.id("select-demo"));
//		Select singleSelect = new Select(singleSelectDropDown);
//
//		singleSelect.selectByIndex(2);
//		Thread.sleep(2000);
//		singleSelect.selectByValue("Thursday");
//		Thread.sleep(2000);
//		singleSelect.selectByVisibleText("Saturday");
//
//		System.out.println(singleSelect.getFirstSelectedOption().getText());
//		List<WebElement> allSelectedOptions = singleSelect.getAllSelectedOptions();
//		System.out.println("List size: " + allSelectedOptions.size());
//		for (WebElement obj : allSelectedOptions) {
//			System.out.println(obj.getText());
//		}
//
//		List<WebElement> options = singleSelect.getOptions();
//
//		for (WebElement ele : options) {
//			System.out.println(ele.getAttribute("value"));
//		}
//
//		System.out.println(singleSelect.isMultiple());
//		
//		driver.findElement(By.id("")).click();
//
//		// Multi select
//		WebElement multiDropdown = driver.findElement(By.id("multi-select"));
//		Select multiDropBox = new Select(multiDropdown);
//		System.out.println(multiDropBox.isMultiple());
//		multiDropBox.selectByIndex(2);
//		multiDropBox.selectByValue("Ohio");
//		multiDropBox.selectByVisibleText("Washington");
//		System.out.println(multiDropBox.getFirstSelectedOption().getText());
//		List<WebElement> allSelectedOptions2 = multiDropBox.getAllSelectedOptions();
//		for (WebElement ele : allSelectedOptions) {
//			System.out.println(ele.getText());
//		}
//		Thread.sleep(2000);
//		multiDropBox.deselectByVisibleText("Ohio");
//		Thread.sleep(2000);
//		multiDropBox.deselectAll();

		driver.get("https://www.browserstack.com/");
		WebElement link = driver.findElement(By.linkText("View all testimonials"));
		Actions actions = new Actions(driver);

		Point location = link.getLocation();

		actions.scrollByAmount(location.x, location.y).keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
		
	}

}
