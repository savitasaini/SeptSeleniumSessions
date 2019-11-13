package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testspicejet {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.spicejet.com");
		Actions action = new Actions(driver);
        
		WebElement loginLink =   driver.findElement(By.className("link"));
		action.moveToElement(loginLink).build().perform();
		driver.findElement(By.linkText("SpiceClub Members")).click();
		
	}
	
}
