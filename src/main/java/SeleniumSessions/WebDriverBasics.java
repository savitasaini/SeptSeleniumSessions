package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","/Users/savita/AppData/Local/Temp/Temp1_chromedriver_win32.zip/chromedriver.exe");
		WebDriver driver =new ChromeDriver();//1.Open the browser
		driver.get("http://google.com");//2.enter url.
         String title =driver.getTitle();//3.get the page title.
         System.out.println(title);
		if (title.equals("Google")){
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());
	//	driver.quit();              //close the browser--session id is null
	//	driver .close(); //no such exception:invalid session id
		System.out.println(driver.getTitle());//session ID is null .Using webdriver after calling quit()?
		
	}

}
