package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//absolute xpath://html//div//div[2]/div[1]//div[3]//div//span--id
		//relative xpath/custom xpath://span[@id='test']
		
		//Xpath Axes:
		
		//div[@class='input-group']//following::input[@name='username']
	//	(//div[@class='input-group']//following::input)[1]  ---->if usernameis not there
		//input[@name='username']//preceding::div   ---to all the child
		//input[@name='username']//parent::div   ---to move to parent
		//div[@class='input-group']//child::input
		//div[@class='input-group']//ancestor::div[@class='container']
		
		//span[text()='savita k']//ancestor::td//preceding-sibling::td//input
		//span[text()='savita k']//ancestor::td//preceding-sibling::td//child::input--.>even this will work

		WebElement emailID=driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		action.sendKeys(emailID, "saini_savita@hotmail.com").build().perform();
		action.sendKeys(password, "Testing123").build().perform();
		action.click(loginButton).build().perform();
		Thread.sleep(3000);
		
		driver.navigate().to("https://app.hubspot.com/contacts/6537172/contacts/list/view/all/?");
	
		
		selectContact(action,driver,"savita k");
		
	}
public static void selectContact(Actions action,WebDriver driver,String contactName){
	action.click(driver.findElement(By.xpath("//span[text()='"+contactName+"']//ancestor::td//preceding-sibling::td//child::input"))).build().perform();
	
}
}
