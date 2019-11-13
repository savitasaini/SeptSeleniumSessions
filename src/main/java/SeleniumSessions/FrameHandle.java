package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/");
		
	//1st way	WebElement frameElement =driver.findElement(By.name("main"));
	//	        driver.switchTo().frame(frameElement);
		
	//	driver.switchTo().frame("main");
	//	driver.switchTo().frame(2);
	//	driver.switchTo().defaultContent();  ///driver will come back on previous frame
		driver.findElement(By.id("frame"));
	//--to go back to diff frame    driver.switchTo().parentFrame();
		
	String text=driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
	}

}
