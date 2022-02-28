package week3.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amozon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		//2.search as APPLE IPHONE
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iphone 13pro",Keys.ENTER);
		//3.Get the price of the first product
		String price = driver.findElement(By.xpath("(//span[text()='1,49,900'])[1]")).getText();
		System.out.println("PRICE FOR FIRST PRODUCT =" +price);
		//4. Print the number of customer ratings for the first displayed product
		
		//5. click on the stars 
		//6. Get the percentage of ratings for the 5 star.
		//7. Click the first text link of the first image
		//8. Take a screen shot of the product displayed
		//9. Click 'Add to Cart' button
		//10. Get the cart subtotal and verify if it is correct
		
	}

}
