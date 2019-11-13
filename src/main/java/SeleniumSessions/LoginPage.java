package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://app.hubspot.com/login");
		
		
		//page objects:
		By emailId = By.id("username");
		By password =By.id("password");
		By loginButton = By.id("loginBtn");
		
		
		Util util = new Util(driver);
		
		String title= util.waitforTitlePresent("HubSpot", 10);
		System.out.println(title);
		
		util.waitforElementPresent(emailId, 15);
		util.doSendKeys(emailId,"naveen@gmail.com");
		
		util.doSendKeys(password, "test@123");
		
		util.waitforElementPresent(loginButton, 5);
		util.doClick(loginButton);
		
		
		
	}

}
