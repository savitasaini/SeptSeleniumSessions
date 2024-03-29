package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");	
	    //	Thread.sleep(5000);
        //applied for all the elements
		//global wait
		//dynamic wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//decrease secs --3  //no such element exception
		System.out.println(driver.getTitle());
		
		
		WebElement emailID=driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		emailID.sendKeys("test@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//u can also put 0 
		
	}

}
