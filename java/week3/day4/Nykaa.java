package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Actions builder=new Actions(driver);
//		driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']")).sendKeys("L'Oreal Paris",Keys.ENTER);
//		
//		driver.findElement(By.xpath("//span[text()='Gender']")).click();
//	
		
		WebElement brand=driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brand).perform();
		
		WebElement paris=driver.findElement(By.linkText("L'Oreal Paris"));
		Actions builder1=new Actions(driver);
		builder1.click(paris).build().perform();
		
		String title1=driver.getTitle();
		System.out.println(title1);
	}

}
