package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//id:#{id}
	//	#username
		
	//input#username
	//input[id='username']
	//input[id='username'][type='email']
	// button#loginBtn	
		
		//class:
	//	.form-control.private-form__control.login-email
	//	input.form-control.private-form__control.login-email
	//	input.login-email
	//	button.login-submit
		
	//text:
	//	input[id^='username']  ----starting text
	//  input[id$='username']	----ending text
	//	input[id$='name']
		
	//	input[id*='username'] ---contains text
	//	input[id*='user'] 
	//	div>input[id='username']
	//	div.private-form__input-wrapper>input[id='username']
	//	div.private-form__input-wrapper>input#username
		
		//Reversing Xpath:traversing from child to parent --->grand parent--->super parent-->top parent in DOM
		////input[@id='username']/../../../../../../../../../..
     String id=	driver.findElement(By.xpath("//input[@id='username']/../../../../..")).getAttribute("id");
		System.out.println(id);
	
	
		WebElement emailID=driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		action.sendKeys(emailID, "naveenanimation20@gmail.com").build().perform();
		action.sendKeys(password, "Test@12345").build().perform();
		action.click(loginButton).build().perform();
		Thread.sleep(4000);
		
	}

}
