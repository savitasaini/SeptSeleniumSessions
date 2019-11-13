package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		
	WebElement rightClickMeElement=	driver.findElement(By.className("context-menu-one"));
	WebElement rightClickMeElement1 = driver.findElement(By.className("context-menu-one"));
	WebElement rightClickMeElement2 = driver.findElement(By.className("context-menu-one"));
	 WebElement rightClickMeElement3 = driver.findElement(By.className("context-menu-one"));
	 WebElement  rightClickMeElement4 = driver.findElement(By.className("context-menu-one"));
	//   WebElement rightClickMeElement5= driver.findElement(By.className("context-menu-one"));
	                                    		
	
	Actions action = new Actions(driver);
	action.contextClick(rightClickMeElement).build().perform();
	action.contextClick(rightClickMeElement1).build().perform();
	action.contextClick(rightClickMeElement2).build().perform();
	action.contextClick(rightClickMeElement3).build().perform();
	action.contextClick(rightClickMeElement4).build().perform();
//	action.click(rightClickMeElement5).build().perform();
	
     String text=driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-copy')]/span")).getText();
	 System.out.println(text);
	  String text1  =  driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-paste')]/span")).getText();
	   System.out.println(text1);
	       String text2=   driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-edit')]/span")).getText();
	       System.out.println(text2);
	            String text3=  driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-delete')]/span")).getText();
	       System.out.println(text3);
	         String text4= driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-cut')]/span")).getText();
	       System.out.println(text4);
	   //     String text5= driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-quit')]/span")).getText();
	     //  System.out.println(text5);
	}

	
	
	
}
