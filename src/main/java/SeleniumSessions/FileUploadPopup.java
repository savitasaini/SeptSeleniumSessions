package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		//driver.findElement(By.name("upfile")).sendKeys("C:/Users/savita/Documents");//correct path for download should be given this case it didnt work.
		//type =file
		//Also when u inspect type = file should be there else u wont be able to download
		driver.findElement(By.name("upfile")).click();
	}

}
