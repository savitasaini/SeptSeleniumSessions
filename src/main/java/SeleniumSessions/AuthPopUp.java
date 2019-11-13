package SeleniumSessions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AuthPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/savita/AppData/Local/Temp/Temp1_chromedriver_win32.zip/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
	}

}
