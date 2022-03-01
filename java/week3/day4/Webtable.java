package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.css.model.Value;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//GET THE COUNT OF THE COLUMN
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int size = column.size();
		System.out.println("The Number of Column Is = "+size);
		
		//GET THE COUNT OF THE ROW
		List<WebElement> row = driver.findElements(By.tagName("td"));
		int size1 = row.size();
		System.out.println("The Number of Rows is ="+size1);
		
		//PRINT THE PROGRESS VALUE     //driver.findElements();to use List
		String text = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td[1]")).getText();
		System.out.println("Learn to interact with Elements Progress Value is = "+text);
		
		//6th ROW 2ND COLUMN
		String text2 = driver.findElement(By.xpath("//td[text()='Sarath']/following-sibling::td[1]")).getText();
		System.out.println("6 th row 2 nd column ="+text2);
		System.out.println("-----------------------------");
		
		System.out.println(" All Headings ");
		System.out.println("-----------------------------");		
		//Thread.sleep(2000);
		for(int i=1;i<=size;i++) {
			String text3 = driver.findElement(By.xpath("//tr/th["+i+"]")).getText();
			System.out.println(""+text3);
			
		}
		System.out.println("-------------------------------------------------------");
	
		for(int i=2;i<=size1;i++) {
			
		String text1 = driver.findElement(By.xpath("//table[@id='table_id']/tr["+i+"]/td[2]")).getText();
		//System.out.println(text3);
		String replaceall = text1.replaceAll("%","");
		System.out.println(replaceall);
		
		int parseInt = Integer.parseInt(replaceall);
		System.out.println(parseInt);
		
		
		//value.add(parseInt);
		}
		//driver.close();
	}

}
