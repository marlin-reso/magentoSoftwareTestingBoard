package com.softwaretestingboard.magento.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.softwaretestingboard.magento.factorydriver.DriverFactory;
import com.softwaretestingboard.magento.pages.LoginPage;

public class BaseTest {
	WebDriver driver;
	DriverFactory df;
	protected LoginPage loginPage ;
	
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		driver = df.initDriver("chrome");
		loginPage = new LoginPage(driver);
		
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
