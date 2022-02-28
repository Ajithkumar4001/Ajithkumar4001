package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grandchild {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Grand Parent to Grand Child
		driver.findElement(By.xpath("//form[@id='login']//input")).sendKeys("Demosalesmanager");
		//Grand Parent to Grand Child 
		driver.findElement(By.xpath("//form[@id='login']//input[@type='password']")).sendKeys("crmsfa");
		//Grand Parent to Grand Child 
		driver.findElement(By.xpath("//form[@id='login']//input[@type='submit']")).click();
		 
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
	}

}
