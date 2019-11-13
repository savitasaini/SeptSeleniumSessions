package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
      WebElement day =  driver.findElement(By.id("day"));
      WebElement month = driver.findElement(By.id("month"));
      WebElement year = driver.findElement(By.id("year"));
      
      Select select = new Select(day);
    //   select.selectByVisibleText("5");
    //     select.selectByIndex(10);//another way to select by passing index//10th oct
      
    //    Select select1 = new Select(month);
    //  select1.selectByVisibleText("May");
    //     select1.selectByIndex(8);  //another way //Aug 8th month got slected
   //   Select select2 = new Select(year);
   //   select2.selectByVisibleText("1995");
      
      
    //    selectValueFromDropDown(day,"5");
   //     selectValueFromDropDown(month,"May");
   //     selectValueFromDropDown(year,"1990");
      
  
      System.out.println(select.isMultiple());//when u can select multiple values from dropdown...FB case its false
      
	}
	
	
	
	
	
	
	
	//If u have 10 drop down u have to write many time select statement so we create generic method //down starting
/**
 * This method is used to select the value from a drop down on the basis of given text
 * @param element
 * @param value
 */
	public static void selectValueFromDropDownByText(WebElement element,String value){
	Select select = new Select(element);
	select.selectByVisibleText(value);

}
	public static void selectValueFromDropDownByIndex(WebElement element,int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	
	
	
}
