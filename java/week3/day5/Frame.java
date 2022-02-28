package week3.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement click1 = driver.findElement(By.id("Click"));
		click1.click();
		String text=click1.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement click2 = driver.findElement(By.id("Click1"));
		click2.click();
		String text1=click2.getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
	
		List<WebElement> column = driver.findElements(By.tagName("iframe"));
		int size = column.size();
		System.out.println("The Number of Frame is  = "+size);
		
//		driver.switchTo().frame("frame2");
//		WebElement click3 = driver.findElement(By.xpath("//body[text()='Find total number of frames.']"));
//		click3.click();
//		String text2=click3.getText();
//		System.out.println(text2);
		
		
		//FRAME
//		driver.switchTo().frame(index,name.id);
//		
//		String text = driver.findElement(By.name("frame2")).getText();
//		System.out.println(text);
//			driver.switchTo().defaultContent();
	
	}

}
