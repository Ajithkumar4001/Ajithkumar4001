package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Ajithkumar");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("V");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Ajith");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='createContactForm_birthDate']")).sendKeys("04/06/1999");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Computer Science and Engineering");
		
		WebElement DropDown1=driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select value=new Select(DropDown1);
		value.selectByValue("INR");
		//doubt description
//		17. Clear the Description Field using .clear 
//		18. Fill ImportantNote Field with Any text
		//driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).sendKeys("hi i am ajithkumar i studided in TestLeaf software solutions");
		driver.findElement(By.xpath("//input[@id='createContactForm_accountPartyId']")).sendKeys("25000");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneCountryCode']")).sendKeys("+91");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneNumber']")).sendKeys("9786252546");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("ajithkumarengineering@gmail.com");
		driver.findElement(By.xpath("//input[@id='createContactForm_generalAddress1']")).sendKeys("Zamin Kollan kondan");
		driver.findElement(By.xpath("//input[@id='createContactForm_generalCity']")).sendKeys("Rajapalayam");
		driver.findElement(By.xpath("//input[@id='createContactForm_generalPostalCode']")).sendKeys("626142");
		
		WebElement DropDown3=driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select value1=new Select(DropDown3);
		value1.selectByValue("IND");
		
		
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    driver.findElement(By.className("smallSubmit")).click();
	    //submitButton
		String title1=driver.getTitle();
		String title2="View Contact | opentaps CRM";
	    if (title1.equals(title2)) {
			System.out.println("Testcase Pass");
		}else {
			System.err.println("Testcase Fail");
		}
		
	}
}
