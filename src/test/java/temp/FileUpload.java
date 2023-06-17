package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/upload");

		Thread.sleep(2000);

		driver.findElement(By.id("file-upload")).sendKeys("D:\\kanerika\\Training\\Selenium\\UploadFile.txt");

		Thread.sleep(2000);

		driver.findElement(By.id("file-submit")).click();

	}

}
