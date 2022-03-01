package week3.day6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException, IOException {
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
		String shoesCount = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div")).getText();
		System.out.println("Sports shoe for men Count is : "+shoesCount);

//		5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
//		6. Sort by Low to High
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']//li[@data-index='1']")).click();
		
//		7. Check if the items displayed are sorted correctly
		java.util.List<WebElement> product = driver.findElements(By.xpath("//div[@id='products']//span[@class='lfloat product-price']"));
		int size = product.size();
		System.out.println("Toatal Size is = "+size);
		
			WebElement sortPrice = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]"));
			String prize1 = sortPrice.getText();
			//Thread.sleep(2000);
			String replaceAll = prize1.replaceAll("\\D", "");
			//Thread.sleep(2000);
			//System.out.println(replaceAll);
			int product1 = Integer.parseInt(replaceAll);
			
			for (int i = 2; i < size; i++)
			{
				WebElement sortPrice1 = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])["+i+"]"));
				String prize2 = sortPrice1.getText();
				String replaceAll1 = prize2.replaceAll("\\D", "");
				
				int product2 = Integer.parseInt(replaceAll1);
				//Thread.sleep(2000);
				
				if(product2  >= product1)
				{
					
				}
				else
				{
					System.err.println("Testcase Fail : Not in the selected order");
				}
				
			}
			System.out.println("The shoes are displayed in a selected order.");
		
//		8.Select the price range (900-1200)
		driver.findElement(By.xpath("//div[@class='price-input']//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//div[@class='price-input']//input[@name='fromVal']")).sendKeys("900");
		driver.findElement(By.xpath("//div[@class='price-input']//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//div[@class='price-input']//input[@name='toVal']")).sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(2000);
		
//		9.Filter with color Navy 
		driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '] [5])[1]")).click();
		
//		11. Mouse Hover on first resulting Training shoes
		WebElement element6 = driver.findElement(By.xpath("(//div[@class='product-tuple-image '])[1]"));
		Actions click2= new Actions(driver);
		click2.moveToElement(element6).perform();
		Thread.sleep(2000);
		
		WebElement element7 = driver.findElement(By.partialLinkText("Red Tape Walking  Navy Training"));
		Actions click3=new Actions(driver);
		click3.moveToElement(element7).perform();
		
//		12. click QuickView button
		driver.findElement(By.xpath("(//div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]")).click();
		
//		13. Print the cost and the discount percentage
		String text5 = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The discount percentage is :"+text5);
		
//		14. Take the snapshot of the shoes.
		Thread.sleep(2000);
		File snap=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./Images/shoeimage.png");
		FileUtils.copyFile(snap,des);
		Thread.sleep(2000);
		
//		15. Close the current window
		//driver.close();
//		16. Close the main window
		//driver.quit();
	}

}
