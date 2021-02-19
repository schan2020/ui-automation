package stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.ui.GoogleBasePage;
import com.google.ui.SearchResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.google.ui.*;

public class SearchTextSteps {

	HomePage homePage;
	SearchResultsPage searchResultsPage;
	public WebDriver driver;

	@Given("User launches the browser")
	public void user_launches_the_browser() {
		System.out.println("Launching the browser");
		System.setProperty("webdriver.gecko.driver", "/Users/supraja/Desktop/geckodriver");
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		GoogleBasePage.driver = driver;
	}

	@Given("User navigates to google home page")
	public void user_navigates_to_google_home_page() {
		System.out.println("Launching Google");
		driver.get("https://www.google.com");
		System.out.println("Verifying the title....:" + driver.getTitle());

	}

	@When("User inputs duck in the search box")
	public void user_inputs_duck_in_the_search_box() {
		System.out.println("Entering ducks in searchbox");
		// driver.findElement(By.name("q")).sendKeys("ducks");
		homePage = new HomePage();
		homePage.enterText("ducks");

	}

	@When("clicks Enter")
	public void clicks_Enter() {
		System.out.println("clicking Enter");
		// driver.findElement(By.name("q")).submit();
		homePage.clickSearchButton();
	}

	@Then("Verify the search results contains duck")
	public void verify_the_search_results_contains_duck() {
		System.out.println("Getting Results");
		searchResultsPage = homePage.clickSearchButton();
		driver.close();

	}

}
