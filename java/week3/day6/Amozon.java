package week3.day6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amozon {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		//2.search as ONE+ PHONE
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9pro",Keys.ENTER);
		
		
		//3.Get the price of the first product
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		String price = text.replaceAll("\\D", "");
		System.out.println("THE PRIZE OF FIRST PRODUCT = "+price);
		
		//4. Print the number of customer ratings for the first displayed product
		String rate = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("THE NUMBER OF CUSTOMER RATINGS = "+rate);
		
		//5. click on the stars
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		//6. Get the percentage of ratings for the 5 star.
		String starrating = driver.findElement(By.xpath("(//span/a[@class='a-link-normal'])[1]")).getText();
		System.out.println("THE STAR RATING PERCENTAGE FOR 5 STAR RATING IS = " +starrating);
		
		//7. Click the first text link of the first image
		driver.findElement(By.xpath("//span[text()='OnePlus 9 Pro 5G (Morning Mist, 12GB RAM, 256GB Storage)']")).click();

		//window Handling
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		ArrayList<String> value =new ArrayList<String>(windowHandles);
		driver.switchTo().window(value.get(1));
		String Urllink = driver.getCurrentUrl();
		System.out.println("URL LINK  = "+Urllink);
		
		//8. Take a screen shot of the product displayed
		File source=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./amazon/screenshot.png");
		FileUtils.copyFile(source, des);
		
		//9. Click 'Add to Cart' button
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']//input")).click();
		
		//10. Get the cart subtotal and verify if it is correct
		String subtotal = driver.findElement(By.xpath("//span[@id='sc-subtotal-label-buybox']")).getText();
		System.out.println("CART SUBTOTAL IS = "+subtotal);
		
		if(subtotal.contains(subtotal))
		{
			System.out.println("Testcase Pass");
			Thread.sleep(2000);
			driver.quit();
		}
		else
		{
			System.err.println("Testcase Fail");
		}
	}

}
