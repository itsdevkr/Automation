package com.practo.testScripts;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.practo.library.baseTest;
import com.practo.pageObjects.practoHomePage;
import com.practo.pageObjects.practoLoginPage;

public class practoLoginLogin extends baseTest{
	
	@Test
	public void credForLogin() {
		try {
			
			practoHomePage pHomePage = new practoHomePage(driver);
			pHomePage.btnLogin.click();
			
			practoLoginPage pLoginPage = new practoLoginPage(driver);
			pLoginPage.username().sendKeys("kdev2817@gmail.com");
			pLoginPage.password().sendKeys("Rfvmlp@7871");
			pLoginPage.checkBox().click();
			
			pLoginPage.clickLogin().click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			String expTitle = "Practo | Video Consultation with Doctors, Book Doctor Appointments, Order Medicine, Diagnostic Tests";
			String actTitle = driver.getTitle();
			
			AssertJUnit.assertEquals(expTitle, actTitle);
			Reporter.log("Title is Matched!!", true);
			
		}catch(Exception e) {
			Reporter.log("Title is NOT Matched!!", true);
			Assert.fail();
		}
	}
	
}
