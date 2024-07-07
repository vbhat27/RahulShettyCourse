package rahulshetty.veggiesSite;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingMultipleProds {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		// initialization j because we should increment j if the product is found and
		// break the loop
		int j = 0;
		// Adding multiple products to cart
		// Step 1:Create an string array of products to be selected

		String[] listOfProds = { "Cucumber", "Beans", "Potato" };

		// Step 2:Get all the list of products available in the prod selection page

		List<WebElement> prodslist = driver.findElements(By.xpath("//h4[@class='product-name']"));

		// Step 3:Iterate through each and every element and select the desired product
		// using if condition and click on Add to cart button
		for (int i = 0; i < prodslist.size(); i++) {

			// increment j

			String[] name = prodslist.get(i).getText().split("-");
			String finalProds = name[0].trim();
			// Convert arrays into arraylist because array list can hold more space than
			// arrays also it supports contains method
			List listOfNames = Arrays.asList(listOfProds);

			if (listOfNames.contains(finalProds)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

				if (j > 3) {
					break;
				}

				System.out.println("Check this out");
				System.out.println("Check this out");
				System.out.println("Check this out");
				System.out.println("Check this out");
			}

		}

	}
	
}
