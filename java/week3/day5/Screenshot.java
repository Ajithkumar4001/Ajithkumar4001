package week3.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ajith");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		//SCREENSHOT
		File source1=driver.getScreenshotAs(OutputType.FILE);
		File des1=new File("./FaceBookScreenShot2.png");
		FileUtils.copyFile(source1, des1);
		
		driver.findElement(By.name("reg_email__")).sendKeys("ajithkumarengineering@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ajithkumarengineering@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Ajith4001");
		//DropDown Date of Birth
		WebElement DropDown1=driver.findElement(By.id("day"));
		Select ele1=new Select(DropDown1);
		ele1.selectByValue("4");
		
		WebElement DropDown2=driver.findElement(By.id("month"));
		Select ele2=new Select(DropDown2);
		ele2.selectByValue("6");
		
		WebElement DropDown3=driver.findElement(By.id("year"));
		Select ele3=new Select(DropDown3);
		ele3.selectByValue("1999");
		//this is Child to Parent
		driver.findElement(By.xpath("//input[@value='2']/..")).click();
		//driver.findElement(By.name("websubmit")).click();
		
		
		File source=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./FaceBookScreenShot.png");
		FileUtils.copyFile(source, des);
	}

}
