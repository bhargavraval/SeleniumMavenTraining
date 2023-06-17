package temp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/browser-windows");

		System.out.println("Main window title: " + driver.getTitle());

		String mainWindow = driver.getWindowHandle();

		driver.findElement(By.id("tabButton")).click();

		Thread.sleep(2000);

		Set<String> windowHandles = driver.getWindowHandles();

		for (String str : windowHandles) {
			if (!(str.equals(mainWindow))) {
				driver.switchTo().window(str);
			}
		}

		Thread.sleep(1000);

		System.out.println(driver.findElement(By.id("sampleHeading")).getText());

		driver.close();

		driver.switchTo().window(mainWindow);

		driver.findElement(By.id("messageWindowButton")).click();

		Set<String> windowHandles2 = driver.getWindowHandles();

		for (String str : windowHandles2) {
			if (!(str.equals(mainWindow))) {
				driver.switchTo().window(str);
			}
		}

		Thread.sleep(1000);

		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.close();

		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
