package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		////a[contains(text(),'Leads')]
		//driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		//driver
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Infosys");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ajithkumar");
//		WebElement DropDown2=driver.findElement(By.xpath("//input[@id='createLeadForm_dataSourceId']"));
//		Select text=new Select(DropDown2);
//		text.selectByVisibleText("Employee");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("V");
		
		WebElement DropDown2=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select text=new Select(DropDown2);
		text.selectByVisibleText("Employee");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Ajith");

		WebElement DropDown1=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select value=new Select(DropDown1);
		value.selectByValue("IND_HARDWARE");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("v");
		driver.findElement(By.xpath("//input[@id='createLeadForm_birthDate']")).sendKeys("04/06/1999");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Computer Science and Engineering");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("+91");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9786252546");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("ajithkumarengineering@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("Ajith");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("Zamin Kollan kondan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("Rajapalayam");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("626142");
		WebElement DropDown3=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select value1=new Select(DropDown3);
		value1.selectByValue("IND");
		
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
