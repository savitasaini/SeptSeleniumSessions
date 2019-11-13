package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

	//Before--Test---After
//	launch browser--BS
//	launch URL--BT
//	Login to app--BC
	
//	go to home page--BM
//	home page header test...--Test1
//	logout--AM
	
//	go to home page--AC
//	home page title test...----Test2
//	logout--AM
	
//	go to login page--AC
//	disconnectwithDB--AT
//	close the browser--AS
	
	@BeforeSuite
	public void launchBrowser(){
		System.out.println("launch browser");
	}
	@BeforeTest
	public void launchURL(){
		System.out.println("launch URL");
	}
	
	@BeforeClass
	public void loginToApp(){
		System.out.println("Login to app");
	}
	@BeforeMethod
	public void gotoHomePage(){
		System.out.println("go to home page");
	}
	
	@Test(priority=1)
	public void homePageTitleTest(){
		System.out.println("home page title test...");
	}
	@Test(priority=2)
	public void homePageHeaderTest(){
		System.out.println("home page header test...");
	}
	@Test(priority=3,enabled=false)
	public void homePageLinkTest(){
		System.out.println("home page link test...");
	}
	@AfterMethod
	public void logout(){
		System.out.println("logout");
	}
	@AfterClass
	public void goToLoginPage(){
		System.out.println("go to login page");
	}
	@AfterTest()
		public void disconnectWithDB(){
			System.out.println("disconnectwithDB");
		}
	@AfterSuite
	public void closeBrowser(){
		System.out.println("close the browser");
	}
	
	
	}

