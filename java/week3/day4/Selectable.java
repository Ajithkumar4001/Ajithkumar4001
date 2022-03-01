package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.get("http://www.leafground.com/pages/drag.html");
	//	driver.get("http://www.leafground.com/pages/selectable.html");
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//SELECTABLE
//		WebElement select1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
//		
//		WebElement Select2 = driver.findElement(By.xpath("//li[text()='Item 5']"));
//		
//		WebElement Select3 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		
//		SORTABLE
		WebElement sort1 = driver.findElement(By.xpath("//ul[@id='sortable']//li[2]"));
		
		WebElement sort2 = driver.findElement(By.xpath("//ul[@id='sortable']//li[6]"));
		
		Actions builder=new Actions(driver);
		
		//SELECTABLE
		//builder.clickAndHold(select1).moveToElement(Select2).release().perform();
		//ClikAndHold //TO USE A METHOD TO CLICK THE ELEMENT AND HOLD ALSO
		//release().1 TO 5 SELECTED THEN RELEASE THE ELEMENTS 
		//perform(); TO PERFORM THE ALL ACTIONS 
		
		//builder.keyDown(Keys.CONTROL).click(select1).click(Select2).click(Select3).perform();
		
		builder.clickAndHold(sort2).moveToElement(sort1).perform();
	}
}
