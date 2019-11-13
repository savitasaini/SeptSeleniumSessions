package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {

	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		
		
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	WebElement country = driver.findElement(By.id("country"));
   
	 
   Select select  = new Select(country);
	
	select.selectByVisibleText("Angola");
	select.selectByIndex(8);
	List<WebElement> countrylist= select.getOptions();
	System.out.println("total countrys:"+countrylist.size());
			
	
//	for(int i =0;i<countrylist.size();i++){
	//String text =	countrylist.get(i).getText();
	//	System.out.println(text);
	//}
	
	}

}
