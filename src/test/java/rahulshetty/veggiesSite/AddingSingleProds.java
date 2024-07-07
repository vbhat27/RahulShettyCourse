package rahulshetty.veggiesSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingSingleProds {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		//Adding multiple products to cart
		//Step1:Get all the list of products available in the prod selection page
		
		List<WebElement> prodslist = driver.findElements(By.xpath("//h4[@class='product-name']"));
	
		//Step 2:Iterate through each and every element and select the desired product using if condition and click on Add to cart button
		for(int i=0;i<prodslist.size();i++)
		{
			
			String name = prodslist.get(i).getText();
			System.out.println(name);
			
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
			
		}
		
		
	}

}
