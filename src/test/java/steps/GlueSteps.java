package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class GlueSteps {
	@Steps
	HomePage home;
	
	@When("^user launches the application$")
	public void userLaunchesTheApplication() throws Throwable {
		home.launchApp();
	}
	
	@Then("^cart item count should not be displayed$")
	public void cartItemCountShouldNotBeDisplayed() {
		home.checkCartCount(0);
	}

	@And("^searches for \"([^\"]*)\"$")
	public void searchesFor(String product) throws Throwable {
		home.searchItem(product);
	}

	@And("^adds a product to the card$")
	public void addsAProductToTheCard() throws Throwable {
		//
	}

	@Then("^cart item count should be displayed$")
	public void cartItemCountShouldBeDisplayed() throws Throwable {
//		throw new PendingException();
	}
	
}
