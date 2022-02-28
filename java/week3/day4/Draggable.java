package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.get("http://www.leafground.com/pages/drag.html");
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement from = driver.findElement(By.id("draggable"));
		
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions builder=new Actions(driver);
		builder.clickAndHold(from).moveToElement(to).build().perform();
		//builder.dragAndDropBy(drag, 100, 70).build().perform();
		//builder.drag
		
	}
	

}
