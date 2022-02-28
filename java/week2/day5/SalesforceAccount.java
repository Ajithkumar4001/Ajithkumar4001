package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceAccount {
	public static void main(String[] args) {
		//download a WebDriver Manager Automatically
		WebDriverManager.chromedriver().setup();
		//To Launch a Web Browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		//To Maximize the Browser
		driver.manage().window().maximize();
		//To Avoid NosuchExeption Or Stale Element Exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("UserFirstName")).sendKeys("Ajithkumar");
		driver.findElement(By.name("UserLastName")).sendKeys("v");
		driver.findElement(By.name("UserEmail")).sendKeys("ajithkumarengineering@gmail.com");
		
		WebElement DropDown1= driver.findElement(By.name("UserTitle"));
		Select Title=new Select(DropDown1);
		Title.selectByValue("Student / Personal Interest");
		
		driver.findElement(By.name("CompanyName")).sendKeys("N/A");
		
		WebElement DropDown2 = driver.findElement(By.name("CompanyEmployees"));
		Select c1=new Select(DropDown2);
		c1.selectByValue("9");
		//Thread(2000);
		driver.findElement(By.name("UserPhone")).sendKeys("6383715265");
		

		WebElement DropDown3 = driver.findElement(By.name("CompanyCountry"));
		Select c2=new Select(DropDown3);
		c2.selectByValue("IN");
		
		driver.findElement(By.className("checkbox-ui")).click();
       // driver.findElement(By.linkText("start my free trial")).click();
		driver.close();
		
	}

}
