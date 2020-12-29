package com.practo.testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.practo.library.baseTest;
import com.practo.pageObjects.practoHomePage;

public class practoLogin extends baseTest{

	@Test
	public void login() {
		try {
			practoHomePage pHomePage = new practoHomePage(driver);
			pHomePage.btnLogin.click();
			
		}catch(Exception e) {
			Assert.fail();
		}
	}
	
}
