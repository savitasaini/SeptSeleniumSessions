package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageExplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");	
      
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.titleContains("HubSpot"));
		System.out.println(driver.getTitle());
		By emailId=By.id("username");


		
		WebDriverWait wait = new WebDriverWait(driver,20);//change to 3 secs timeoutexception 
		//Exception in thread "main" org.openqa.selenium.TimeoutException:
		//	Expected condition failed: waiting for presence of any elements located by
		//	By.id: username (tried for 3 second(s) with 500 milliseconds interval)
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(emailId));
		
	  WebElement email = driver.findElement(emailId);
	   email.sendKeys("test@gmail.com");
	 
	   //WebElement emailID=driver.findElement(By.id("username"));
	
	   WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		password.sendKeys("test123");
		loginButton.click();
		
		
	}

}
