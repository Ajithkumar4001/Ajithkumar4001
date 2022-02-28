package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ajithkumar");
		driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String text = findElement.getText();
		System.out.println(text);
		findElement.click();
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Delete']")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li/a[text()='Find Leads']")).click();
		driver.findElement(By.name("id")).sendKeys(text);
		driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[text()='Find Leads']")).click();
		String getRecord = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(getRecord.contains(text))
		{
			System.err.println("There is a record"+text);
		}
		else
		{
			System.out.println("Testcase is Pass : "+getRecord);
		}
		//driver.close();
	}
}
