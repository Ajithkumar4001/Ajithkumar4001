package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("email")).sendKeys("ajithkumarengineering@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).clear();
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Tamil",Keys.TAB);
		driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		System.out.println("Edit field is Disabled " +driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
//		Thread.sleep(4000);
//		driver.close();
	}

}
