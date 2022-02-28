package week3.day6;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
//		Launch https://www.snapdeal.com/
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		2. Go to Mens Fashion
		WebElement brand=driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brand).perform();
		
//		3. Go to Sports Shoes
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();

//		4. Get the count of the sports shoes
		String count = driver.findElement(By.xpath("(//div[text()='4043'])[2]")).getText();
		System.out.println("Count of the Sports Shoes = " +count);

//		5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
//		6. Sort by Low to High
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']//li[@data-index='1']")).click();
		
//		7. Check if the items displayed are sorted correctly
		java.util.List<WebElement> product = driver.findElements(By.xpath("//div[@id='products']//span[@class='lfloat product-price']"));
		int size = product.size();
		System.out.println(size);
		for(int i =1;i<=size;i++) {
			WebElement sortPrice = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])["+i+"]"));
			String text2 = sortPrice.getText();
			System.out.println("SortedPrice :"+text2);
		}
//		8.Select the price range (900-1200)
//		9.Filter with color Navy 
//		10 verify the all applied filters 
//		11. Mouse Hover on first resulting Training shoes
//		12. click QuickView button
//		13. Print the cost and the discount percentage
//		14. Take the snapshot of the shoes.
//		15. Close the current window
//		16. Close the main window
	}

}
