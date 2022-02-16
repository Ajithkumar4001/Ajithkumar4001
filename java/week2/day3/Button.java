package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.debugger.model.Location;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Button {

	private static final char[] Height = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("home")).click();
		String text="TestLeaf - Selenium Playground";
		String title=driver.getTitle();
		if(text.equals(title)) {
			System.out.println("Home page is Displayed");
		}else {
			System.out.println("Home Page is not Displayed");
		}
		driver.findElement(By.linkText("Button")).click();
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println(location);
//		int x=location.getX();
//		int y=location.getY();
//		System.out.println(x);
//		System.out.println(y);
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(cssValue);
		Dimension size = driver.findElement(By.id("size")).getSize();
//		int height=size.getHeight();
//		int width =size.getWidth();
//		System.out.println(height);
//		System.out.println(width);
		System.out.println(size);
	}

}
