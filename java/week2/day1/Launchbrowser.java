package week2.day1;

import java.awt.datatransfer.SystemFlavorMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		//driver.get("https://www.amazon.in");
		//driver.get("https://www.apple.com/in/");
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.name("companyName")).sendKeys("Infosys");
		//String title = driver.getTitle();
		//System.out.println(title);
		}
}
