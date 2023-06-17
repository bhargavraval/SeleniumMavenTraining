package temp;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		Thread.sleep(2000);

		// 1. Search for Nikon
		driver.findElement(By.name("search")).sendKeys("Nikon");
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		Thread.sleep(2000);

		// 2. Get the product price
		String productPrice = driver.findElement(By.xpath("//div[@class='product-thumb']//p[@class='price']"))
				.getText();
		String[] split = productPrice.split("\n");
		productPrice = split[0].trim();
		System.out.println("Product price is: " + productPrice);

		// 3. Click on Add to cart
		driver.findElement(By.xpath("//div[@class='product-thumb']/descendant::button[1]")).click();
		Thread.sleep(2000);

		// 4. Verify the success message
		String expMessage = "Success: You have added Nikon D300 to your shopping cart!";
		String successMsg = driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText();
		System.out.println("Success message is proper?: " + successMsg.contains(expMessage));

		// 5. Get the total price on cart button
		String cartTotal = driver.findElement(By.cssSelector("#cart-total")).getText();
		String[] split2 = cartTotal.split("-");
		cartTotal = split2[1].trim();
		System.out.println("Total on cart button: " + cartTotal);
		System.out.println("Total on cart button matches with product price?: " + cartTotal.equals(productPrice));

		// Click on cart button
		driver.findElement(By.cssSelector("#cart-total")).click();

		// 6. Get the total on mini cart
		String totalMinicart = driver.findElement(By.xpath("//strong[text()='Total']/parent::td/following-sibling::td"))
				.getText();
		System.out.println("Total on mini cart is: " + totalMinicart);
		System.out.println("Total on mini cart matches with product price?: " + totalMinicart.equals(productPrice));

		// 7. Click on View Cart link
		driver.findElement(By.xpath("//strong[contains(text(),'View Cart')]")).click();
		Thread.sleep(3000);

		// 8. Get the quantity on cart page
		String qtyCart = driver.findElement(By.xpath("//input[contains(@name,'quantity')]")).getAttribute("value");
		System.out.println("Quantity on cart is: " + qtyCart);
		System.out.println("Is product quantity 1 on cart page?: " + qtyCart.equals("1"));

		// 9. Get the unit price on cart page
		String unitPrice = driver
				.findElement(
						By.xpath("//h1[contains(text(),'Shopping Cart')]/parent::div/descendant::tbody[1]/tr/td[5]"))
				.getText();
		System.out.println("Unit price is: " + unitPrice);
		System.out.println("Unit price matches with product price?: " + unitPrice.equals(productPrice));

		// 10. Get the total price on cart page
		String totalPrice = driver
				.findElement(
						By.xpath("//h1[contains(text(),'Shopping Cart')]/parent::div/descendant::tbody[1]/tr/td[6]"))
				.getText();
		System.out.println("Total price on cart is: " + totalPrice);
		System.out.println("Total price matches with product price?: " + totalPrice.equals(productPrice));

		// Close the browser
		driver.quit();

	}

}
