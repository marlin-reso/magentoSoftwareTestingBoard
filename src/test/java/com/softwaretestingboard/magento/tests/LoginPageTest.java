package com.softwaretestingboard.magento.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.softwaretestingboard.magento.base.BaseTest;
import com.softwaretestingboard.magento.constant.AppConstant;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void loginPageTitleTest() {
		
		String actTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actTitle, AppConstant.LOGIN_PAGE_TITLE);
		
	}
	@Test
	public void loginPageURLTest() {
		
		String actURL = loginPage.getLoginPageURL();
		Assert.assertTrue(actURL.contains(AppConstant.LOGIN_PAGE_URL));
		
	}
	@Test
	public void forgotPwdLinkExistTest() {
		
		
	Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}
	
	
	
	
	
	
	
	
	

}
