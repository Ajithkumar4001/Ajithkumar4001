package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		String url="https://www.snapdeal.com/";
		driver.get(url);
		driver.findElement(By.xpath("//div/button[@id='pushDenied']")).click();
		
		Thread.sleep(1000);
		WebElement mens=driver.findElement(By.linkText("Men's Fashion"));
		Actions builder=new Actions(driver);
		builder.moveToElement(mens).perform();
		
		WebElement shoes=driver.findElement(By.linkText("Sports Shoes"));
		Actions builders=new Actions(driver);
		builders.click(shoes).build().perform();
		
		java.util.List<WebElement> shoesCount = driver.findElements(By.linkText("//div[@class='child-cat-name selected']/following-sibling::div"));
		int size=shoesCount.size();
		System.out.println("Count of Sports Shoes For men's: "+ size);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
