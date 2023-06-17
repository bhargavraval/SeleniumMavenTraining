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

public class Temp2 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

//		// Alert box
//		driver.get("https://demoqa.com/alerts");
//		driver.findElement(By.id("alertButton")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//
//		// Confirmation box dismiss
//		driver.findElement(By.id("confirmButton")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
//		System.out.println(driver.findElement(By.id("confirmResult")).getText());
//
//		// Confirmation box accept
//		driver.findElement(By.id("confirmButton")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.id("confirmResult")).getText());
//
//		// Prompt box
//		String text = "Testing";
//		driver.findElement(By.id("promtButton")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().sendKeys(text);
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.id("promptResult")).getText());

		// Multiple tabs
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
//		Thread.sleep(3000);
//		String mainWindow = driver.getWindowHandle();
//		driver.switchTo().frame("iframeResult");
//		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
//		Thread.sleep(2000);
//		Set<String> windowHandles = driver.getWindowHandles();
//
//		System.out.println("total open windows: " + windowHandles.size());
//		for (String str : windowHandles) {
//			if (!(str.equals(mainWindow))) {
//				driver.switchTo().window(str);
//			}
//		}
//		System.out.println(driver.getTitle());
//		driver.findElement(By.linkText("Bootcamp")).click();
//		Thread.sleep(2000);
//		driver.close();
//		Thread.sleep(2000);
//		driver.switchTo().window(mainWindow);
//		driver.findElement(By.xpath("//div[@class='trytopnav']//a[last()]")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.getTitle());

//		// File upload sendkeys
//		String filePath= System.getProperty("user.dir")+"\\src\\test\\resources\\Files\\UploadFile.txt";
//		System.out.println(filePath);
//		driver.get("https://the-internet.herokuapp.com/upload");
//		driver.findElement(By.id("file-upload")).sendKeys(filePath);
//		driver.findElement(By.id("file-submit")).click();
//		Thread.sleep(3000);

		// File upload Robot class
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement btnUploadFile = driver.findElement(By.id("file-upload"));
		Actions actions = new Actions(driver);
		actions.moveToElement(btnUploadFile).click().perform();
		Thread.sleep(2000);

		Robot robot = new Robot();
		// copying File path to Clipboard
		StringSelection str = new StringSelection("D:\\kanerika\\Training\\Selenium\\UploadFile.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_V);

		robot.delay(1000);

		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		driver.findElement(By.id("file-submit")).click();

//		// Web table
//		driver.get("http://tutorialsninja.com/demo/");
//		Thread.sleep(2000);
//
//		driver.findElement(By.name("search")).sendKeys("Nikon");
//		driver.findElement(By.xpath("//div[@id='search']//button")).click();
//		Thread.sleep(2000);
//
//		// 3. Click on Add to cart
//		driver.findElement(By.xpath("//div[@class='product-thumb']/descendant::button[1]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("search")).sendKeys("Samsung");
//		driver.findElement(By.xpath("//div[@id='search']//button")).click();
//		Thread.sleep(2000);
//
//		// 3. Click on Add to cart
//		driver.findElement(By.xpath("//div[@class='product-thumb']/descendant::button[1]")).click();
//		Thread.sleep(2000);
//
//		// Click on cart button
//		driver.findElement(By.cssSelector("#cart-total")).click();
//
//		// 7. Click on View Cart link
//		driver.findElement(By.xpath("//strong[contains(text(),'View Cart')]")).click();
//		Thread.sleep(3000);
//		
//		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='table-responsive']//tbody//tr"));
//		
//		for(WebElement row : rows) {
//			
//		}

//		driver.quit();

	}

}
