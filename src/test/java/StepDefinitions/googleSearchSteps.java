package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearchSteps {
    @And("Search box is availabe to search")
    public void searchBoxIsAvailabeToSearch() {
        System.out.println("Yes, Search box is available to search in Google");
    }

    @Given("I open Google Homepage on {string} Browser")
    public void iOpenGoogleHomepageOnBrowser(String Browser) {
        System.out.println("Google Homepage is opened in "+Browser+" Browser");
    }

    @Then("I landed on the Google page")
    public void iLandedOnTheGooglePage() {
        System.out.println("Landed on Google Homepage successfully");
    }

}
