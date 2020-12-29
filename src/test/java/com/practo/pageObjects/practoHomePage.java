package com.practo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.practo.library.basePage;

public class practoHomePage extends basePage{

	public practoHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[3]/span/a")
	public WebElement btnLogin;
	public WebElement btnLogin() {
		return btnLogin;
	}
	
	
}
