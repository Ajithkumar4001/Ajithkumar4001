package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateCartAccount {
	public static void main(String[] args) {
		//To Launch a Web Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		//To Maximize the Browser
		driver.manage().window().maximize();
		//To Avoid NosuchExeption Or Stale Element Exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  //  Thread(2000);
		driver.findElement(By.id("input-username")).sendKeys("AJITHKUMAR4001");
		driver.findElement(By.id("input-firstname")).sendKeys("AJITHKUMAR");
		driver.findElement(By.id("input-lastname")).sendKeys("V");
		driver.findElement(By.id("input-email")).sendKeys("ajithkumarengineering@gmail.com");
		
		WebElement dropDown = driver.findElement(By.id("input-country"));
		Select country=new Select(dropDown);
		country.selectByVisibleText("India");
		
		driver.findElement(By.id("input-password")).sendKeys("Ajith4001");
		
		driver.close();
	}

}
