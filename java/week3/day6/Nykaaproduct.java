package week3.day6;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Nykaaproduct {
	public static void main(String[] args) throws InterruptedException {
		
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions options=new ChromeOptions();
		  ChromeDriver driver=new ChromeDriver(options);
		  options.addArguments("--disable-notifications");
		  
//		  1) Go to https://www.nykaa.com/
		  driver.get("https://www.nykaa.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
//		  2) Mouseover on Brands and Search L'Oreal Paris
		  Actions build=new Actions(driver);
		  WebElement brand = driver.findElement(By.xpath("//ul[@class='HeaderNav css-f7ogli']/li/a[text()='brands']"));
		  build.moveToElement(brand).perform();
		  
//		  3) Click L'Oreal Paris
		  driver.findElement(By.xpath("//div[@class='brandSearchMain']/input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		  driver.findElement(By.xpath("//div[@id='scroller-container']//a[1]")).click();
		  
//		  4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		  String title = driver.getTitle();
		  if(title.contains("L'Oreal Paris"))
		  {
		   System.out.println("Testcase Pass, The Title is: "+title);
		  }
		  else
		  {
		   System.err.println("TestCase Fail");
		  }
		  Thread.sleep(2000);
		  
//		  5) Click sort By and select customer top rated
		  driver.findElement(By.xpath("(//div[@id='filters-listing']//div)[3]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[text()='customer top rated']/following::div")).click();
		  
//		  6) Click Category and click Hair->Click haircare->Shampoo
		  driver.findElement(By.xpath("//div[@class='sidebar__inner']//span[text()='Category']")).click();
		  driver.findElement(By.xpath("//span[text()='Category']/following::span[text()='Hair']")).click();
		  driver.findElement(By.xpath("//span[text()='Category']/following::span[text()='Hair Care']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[text()='Category']/following::span[text()='Shampoo']")).click();
		  Thread.sleep(2000);
		  
//		  7) Click->Concern->Color Protection
		  driver.findElement(By.xpath("//span[text()='Concern']")).click();
		  driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		  
//		  8)check whether the Filter is applied with Shampoo
		  String filter = driver.findElement(By.xpath("//span[@class='filter-value'][1]")).getText();
		  if(filter.contains("Shampoo"))
		  {
		   System.out.println("The Filter Shampoo is selected");
		  }
		  else
		  {
		   System.err.println("Shampoo is not selected");
		  }
		  
//		  9) Click on L'Oreal Paris Colour Protect Shampoo
		  driver.findElement(By.xpath("//div[@id='product-list-wrap']//following::img[1]")).click();
		  //driver.findElement(By.xpath("(//div[@class='css-1rd7vky'])[1]")).click();
		  Thread.sleep(500);
		  
		  //WINDOW HANDLING
		  Set<String> windowHandles = driver.getWindowHandles();
		  System.out.println(windowHandles);
		  ArrayList<String> value =new ArrayList<String>(windowHandles);
		  driver.switchTo().window(value.get(1));
		  String currentUrl = driver.getCurrentUrl();
		  System.out.println(currentUrl);  
		  
//		  10) GO to the new window and select size as 175ml
		  WebElement size = driver.findElement(By.xpath("//select[@title='SIZE']"));
		  Select dropDown1=new Select(size);
		  dropDown1.selectByVisibleText("175ml");
		  
//		  11) Print the MRP of the product
		  String mrp = driver.findElement(By.xpath("//span[text()='MRP:']/span")).getText();
		  System.out.println("MRP of the product: "+mrp);
		  
//		  12) Click on ADD to BAG
		  driver.findElement(By.xpath("//button/span[text()='ADD TO BAG']")).click();
		  Thread.sleep(2000);
		  
//		  13) Go to Shopping Bag 
		  driver.findElement(By.xpath("//span[text()='Account']//following::button")).click();
		  driver.switchTo().frame(0);
		  
//		  14) Print the Grand Total amount
		  String grandTotal = driver.findElement(By.xpath("(//div[@class='first-col'])/div[@class='value']")).getText();
		  System.out.println("The Grand Total Amount is : "+grandTotal);
		  
//		  15) Click Proceed
		  driver.findElement(By.xpath("//span[text()='PROCEED']")).click();
		  Thread.sleep(2000);
		  
//		  16) Click on Continue as Guest
		  driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		  Thread.sleep(2000);
		  
//		  17) Check if this grand total is the same in step 14
		  String text = driver.findElement(By.xpath("//div[text()='Grand Total']//following::div")).getText();
		  if(grandTotal.contains(text))
		  {
		   System.out.println("TestCase Pass");
		   driver.quit();
		  }
		  else
		  {
		   System.err.println("TestCase Fail");
		  }
		  Thread.sleep(3000);
		  
//		  18) Close all windows
		  driver.close();
		  Thread.sleep(3000);
	}

}
