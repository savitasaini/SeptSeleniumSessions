package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCard {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
driver.get("https://www.espncricinfo.com/series/8890/scorecard/1200800/karnataka-vs-chhattisgarh-1st-semi-final-vijay-hazare-trophy-2019-20");
		
	List<WebElement>scoreList  =	driver.findElements(By.xpath("//a[contains(text(),'Jiwanjot Singh')]//parent::div//following-sibling::div[@class='cell runs']"));
		System.out.println(scoreList.size());
		
		for(int i=0;i<scoreList.size();i++){
			System.out.println(scoreList.get(i).getText());
		}
		
		
		
		
		
		//a[contains(text(),'Jiwanjot Singh')]//parent::div//following-sibling::div[@class='cell runs']
		
	}
	
	}

