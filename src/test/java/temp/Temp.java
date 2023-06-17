package temp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Temp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://tutorialsninja.com/demo/");

		Thread.sleep(2000);

		// 1. Search for Nikon
		driver.findElement(By.name("search")).sendKeys("Nikon");
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		Thread.sleep(2000);

		// 3. Click on Add to cart
		driver.findElement(By.xpath("//div[@class='product-thumb']/descendant::button[1]")).click();
		Thread.sleep(2000);

		// Click on cart button
		driver.findElement(By.cssSelector("#cart-total")).click();

		// 7. Click on View Cart link
		driver.findElement(By.xpath("//strong[contains(text(),'View Cart')]")).click();
		Thread.sleep(3000);

//		int prodName = 0;
//		int unitPrice = 0;
//		int totalPrice = 0;
//		String strUnitPrice = "";
//		String strTotalPrice = "";
//
//		List<WebElement> headers = driver.findElements(By.xpath("//div[@class='table-responsive']//thead//td"));
//
//		for (int i = 0; i < headers.size(); i++) {
//			if (headers.get(i).getText().equals("Product Name")) {
//				prodName = i+1;
//			} else if (headers.get(i).getText().equals("Unit Price")) {
//				unitPrice = i+1;
//			} else if (headers.get(i).getText().equals("Total")) {
//				totalPrice = i+1;
//			}
//		}
//		System.out.println(prodName + " " + unitPrice + " " + totalPrice);

//		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='table-responsive']//tbody//tr"));
		
		WebElement rows = driver.findElement(By.xpath("//div[@class='table-responsive']//tbody//tr"));
		
		System.out.println(rows);
		
		List<WebElement> tds = rows.findElements(By.tagName("td"));
		
		for(WebElement ele : tds) {
			System.out.println(ele.getText());
		}

//		for (int i = 0; i < rows.size(); i++) {
//			if (rows.get(i).findElement(By.xpath("/td[" + prodName + "]")).getText().equals("Nikon D3000")) {
//				strUnitPrice = rows.get(i).findElement(By.xpath("/td[" + unitPrice + "]")).getText();
//				strTotalPrice = rows.get(i).findElement(By.xpath("/td[" + totalPrice + "]")).getText();
//			}
//		}
//
//		System.out.println("Unit price is: " + strUnitPrice);
//
//		System.out.println("Total price on cart is: " + strTotalPrice);
		
		driver.quit();
	}

}
