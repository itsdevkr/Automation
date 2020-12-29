package com.practo.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage extends baseTest{
	public basePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
