package temp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/upload");

		Thread.sleep(2000);

		WebElement btnUploadFile = driver.findElement(By.id("file-upload"));

		Actions actions = new Actions(driver);

		actions.moveToElement(btnUploadFile).click().perform();
		
		Thread.sleep(3000);

		StringSelection obj = new StringSelection("D:\\kanerika\\Training\\Selenium\\UploadFile.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(2000);

		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
