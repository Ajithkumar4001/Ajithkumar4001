package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) {
		//TO DRIVER DOWNLOAD THE 
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
	
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions builder=new Actions(driver);
		WebElement SelectMen = driver.findElement(By.xpath("//a[@title='MEN']"));
		builder.moveToElement(SelectMen).perform();
		driver.findElement(By.xpath("//a[@title='Jackets & Coats'][1]")).click();
		
		
		
		
		
		
	}
}
