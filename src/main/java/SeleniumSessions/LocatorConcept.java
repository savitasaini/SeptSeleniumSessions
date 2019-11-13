package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/Users/savita/AppData/Local/Temp/Temp1_chromedriver_win32.zip/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		//1.id:  //1st preference id...2nd...name..then xpath/css selectors  or dynamic ids
	//	WebElement email =driver.findElement(By.id("username"));
	//	email.sendKeys("naveenanimation20@gmail.com");
	//	WebElement pwd = driver.findElement(By.id("password"));
	//	pwd.sendKeys("Test@12345");
		
	//	driver.findElements(By.id("username")).sendKeys("test@gmail.com");    //another way to launch 
	//     driver.findElement(By.id("password")).sendKeys("test@123");
		
	//	driver.findElement(By.id("loginBtn")).click();
		
		//2.name:
	//	driver.findElement(By.name("email")).sendKeys("test@gmail.com");// there was no name in hubspot just testing 
		
		//3.xpath:right click on username copy xpath
	//	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
	//	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
		
		//4.CSS selector:
	//	driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
	//	driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
		
		//5.class Name:...4th is not unique always 
		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");//"form-control private-form__control login-email"
		driver.findElement(By.className("login-password")).sendKeys("test@123");//"form-control private-form__control login-password"
		//It didnt work ...form control removed and just login-email and login-password.
		
		//6.link text:only used for links
		
		// driver.findElement(By.linkText("Sign up")).click();
		//7.partial link text:
			driver.findElement(By.partialLinkText("Sign")).click();//partial text--
			
			
			
	}
}

