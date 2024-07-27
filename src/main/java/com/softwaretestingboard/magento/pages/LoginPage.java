package com.softwaretestingboard.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. Private By locators
	private By email = By.id("email");
	private By pwd = By.id("pass");
//	private By signinBtn = By.className("action login primary");
	private By forgotPWDLink = By.linkText("Forgot Your Password?");

	// 2. public class constructor

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. public page actions

	public String getLoginPageTitle() {

		String title = driver.getTitle();
		return title;
	}

	public String getLoginPageURL() {

		String url = driver.getCurrentUrl();
		return url;
	}

	public boolean isForgotPwdLinkExist() {

		return driver.findElement(forgotPWDLink).isDisplayed();
	}

	public void doLogin(String username, String password) {

		driver.findElement(email).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
	//	driver.findElement(signinBtn).click();

 	}

}
