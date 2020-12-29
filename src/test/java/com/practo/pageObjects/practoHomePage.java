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
	
	@FindBy(xpath="//input[@placeholder='Search location']")
	public WebElement location;
	public WebElement loctaion() {
		return location;
	}
	
	@FindBy(xpath="//input[@placeholder='Search doctors, clinics, hospitals, etc.']")
	public WebElement searchAppointmentFor;
	public WebElement searchAppointmentFor() {
		return searchAppointmentFor;
	}
	
	@FindBy(xpath="//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div[1]/div[1]/span[1]/div")
	public WebElement selectAppointment;
	public WebElement selectAppointment() {
		return selectAppointment;
	}
	
	
}
