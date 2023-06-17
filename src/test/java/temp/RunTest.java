package temp;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RunTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();// open the browser

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // hit the url

		Thread.sleep(3000);

//		String title = driver.getTitle();
//		System.out.println("Page title is: " + title);

//		String username = driver.findElement(By.xpath("//div[@class='orangehrm-login-error']/descendant::p[1]"))
//				.getText();
//		String[] str1 = username.split(":");
//
//		String password = driver.findElement(By.xpath("//div[@class='orangehrm-login-error']/descendant::p[2]"))
//				.getText();
//		String[] str2 = password.split(":");

		String cssValue = driver.findElement(By.name("username")).getCssValue("heig");
		System.out.println("CSS Value is: " + cssValue);

//		driver.findElement(By.name("username")).sendKeys(str1[1].trim());
//
//		driver.findElement(By.name("password")).sendKeys(str2[1].trim());
//
//		driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
//
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);

		driver.quit();// close the browser
	}

}
