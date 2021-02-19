package com.google.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;          

public class HomePage extends GoogleBasePage {
	@FindBy(name = "q")
	WebElement search_TextBox;
	
	@FindBy(xpath = "(//input[@class='gNO89b'])[2]")
	WebElement search_Button;
	
	public void enterText(String text) {
		search_TextBox.sendKeys(text);
	}
	
	public SearchResultsPage clickSearchButton() {
		search_Button.submit();
		return new SearchResultsPage();
	}

}
