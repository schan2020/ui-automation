package com.google.ui;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends GoogleBasePage{
	@FindBy(id = "result-stats")
	WebElement resultStats_Text;

	
	@FindBy(xpath = "//span/a[text()='Wikipedia']")
	WebElement wiki_Link;
	
	
	
	
	
	public boolean resultStatsPresent() {
		return resultStats_Text.isDisplayed();
	}
}
