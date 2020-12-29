package com.practo.testScripts;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.practo.library.baseTest;
import com.practo.pageObjects.practoHomePage;
import com.practo.pageObjects.practoLoginPage;

public class setLocation extends baseTest{
	
	@Test
	public void setLoc() {
		
		try {
		practoHomePage pHomePage = new practoHomePage(driver);
		pHomePage.btnLogin.click();
		
		practoLoginPage pLoginPage = new practoLoginPage(driver);
		pLoginPage.username().sendKeys("kdev2817@gmail.com");
		pLoginPage.password().sendKeys("Rfvmlp@7871");
		pLoginPage.checkBox().click();
		
		pLoginPage.clickLogin().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		pHomePage.loctaion().click(); 
		pHomePage.loctaion().sendKeys("");
		pHomePage.loctaion().sendKeys("Chennai");
	}catch(Exception e) {
		Assert.fail();
	}

}}
