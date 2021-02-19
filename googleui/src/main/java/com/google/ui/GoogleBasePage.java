package com.google.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class GoogleBasePage {
	public static WebDriver driver;
	

	public GoogleBasePage() {
	
		PageFactory.initElements(driver, this);
	}
}
