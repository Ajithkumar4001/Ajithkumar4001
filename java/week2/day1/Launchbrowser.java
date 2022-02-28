package week2.day1;

import java.awt.datatransfer.SystemFlavorMap;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		//driver.get("https://www.amazon.in");
		//driver.get("https://www.apple.com/in/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.linkText("Leads")).click();
		//driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.partialLinkText("Create")).click();//This is partial text
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("WIPRO MANAGEMENT");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajithkumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		//driver.findElement(By.className("")).
		WebElement DropDown2=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select text=new Select(DropDown2);
		text.selectByVisibleText("Employee");
		//driver.manage().timeouts().implicitlywait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ajith");
		
		WebElement DropDown1=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select value=new Select(DropDown1);
		value.selectByValue("IND_HARDWARE");
		//text1.selectByVisibleText("Computer Software");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("v");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/06/1999");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science and Engineering");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Information Tecnology");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9786252546");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ajithkumarengineering@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ajith");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Zamin Kollan kondan");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Rajapalayam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Virudhunagar");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("626142");
		/*String title = driver.getTitle();
	    System.out.println(title);*/
		//driver.findElement(By.className("smallSubmit")).click();
		//String title=driver.getTitle();
		//String title2="View Lead | opentaps CRM";
	    //if (title.equals(title2)) {
		//	System.out.println("Testcase Pass");
		//}else {
			//System.err.println("Testcase Fail");
		//}
		//WebElement DropDown2=driver.findElement(By.name("dropdown2"));
		//Select text=new Select(DropDown2);
		//text.selectByVisibleText("Appium");
		//String text2=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		//System.out.println("Company name:"+text2);
		//driver.close();//to close the Browser after run
	}
}
