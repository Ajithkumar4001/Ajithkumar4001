package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ajithkumar");
		driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		System.out.println("The title of the page is :"+driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		String companyName = driver.findElement(By.id("updateLeadForm_companyName")).getText();
		if(companyName.contains("Tcs"))
		{
			 companyName="Infosys";
		}
		else
		{
			 companyName="Tcs";	
		}
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(2000);
		String updatedName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(updatedName.contains(companyName))
		{
			System.out.println("Testcase pass the company name is :"+updatedName);
		}
		else
		{
			System.err.println("Testcase fail");
		}
		driver.close();
	}

}
