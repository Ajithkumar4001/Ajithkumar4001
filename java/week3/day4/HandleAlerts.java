package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Alert BOX
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(3000);
		Alert alertBox = driver.switchTo().alert();//Alert is a Interface
		alertBox.accept();
		//driver.close();
		//CONFIRM BOX
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(3000);
		Alert confirmBox = driver.switchTo().alert();
		confirmBox.dismiss();
		
		//Prompt BOX
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(3000);
		Alert promptBox = driver.switchTo().alert();
		promptBox.accept();
		
	
		
		
		
		
	}

}
