package com.practo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.practo.library.basePage;

public class practoLoginPage extends basePage{

	public practoLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	public WebElement username() {
		return username;
	}
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	public WebElement password() {
		return password;
	}
	@FindBy(xpath="//*[@id=\"rememberMeBlock\"]/div/div/label")
	public WebElement checkBox;
	public WebElement checkBox() {
		return checkBox;
	}
	@FindBy(xpath="//button[@type='submit']")
	public WebElement clickLogin;
	public WebElement clickLogin() {
		return clickLogin;
	}
}
