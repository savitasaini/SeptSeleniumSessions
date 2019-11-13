package TestNGSessions;

import org.testng.annotations.Test;

public class TestPriority {
	@Test(priority=0)
	public void homePageTitleTest(){
		System.out.println("home page title test...");
	}
	@Test(priority=2)
	public void homePageHeaderTest(){
		System.out.println("home page header test...");
	}
	@Test(priority=3)
	public void homePageLinkTest(){
		System.out.println("home page link test...");
}
	@Test(priority=4)
	public void homePageUserTest(){
		System.out.println("home page user test....");
	}
	
	
}