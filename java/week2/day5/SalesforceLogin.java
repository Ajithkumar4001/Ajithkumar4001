package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();		
		driver.get("https://login.salesforce.com/");
		//To Maximize the Browser
		driver.manage().window().maximize();
		//To Avoid NosuchExeption Or Stale Element Exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();	
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		driver.findElement(By.xpath("//a[@title='Opportunities']")).click();
		//driver.findElement(By.className("")).click();
//		driver.findElement(By.xpath("//div[text()='New']")).click();
//		driver.findElement(By.name("Name")).sendKeys("Salesforce Automation by AJITHKUMAR");
//		System.out.println(driver.findElement(By.name("Name")).getText());
		
	}

}
