package com.softwaretestingboard.magento.factorydriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.softwaretestingboard.magento.error.Errors;
import com.softwaretestingboard.magento.exception.BrowserException;

public class DriverFactory {

	WebDriver driver;

	public WebDriver initDriver(String browserName) {

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			throw new BrowserException(Errors.BROWSER_EXCEPTION +" : " + browserName);
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login");
		
		return driver;

	}

}
