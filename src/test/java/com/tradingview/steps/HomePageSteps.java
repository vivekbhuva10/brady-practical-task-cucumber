package com.tradingview.steps;

import com.tradingview.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I click on sign in button$")
    public void iClickOnSignInButton() {
        new HomePage().setAcceptCookies();
        new HomePage().clickOnSignButton();
        new HomePage().clickOnHeaderSignInButton();

    }

    @And("^I click on Email button$")
    public void iClickOnEmailButton() {
        new HomePage().clickEmailTab();
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new HomePage().enterEmail(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String passcode)  {
        new HomePage().enterPassword(passcode);

    }

    @And("^I click on email sign in button$")
    public void iClickOnEmailSignInButton() {
        new HomePage().clickOnSubmitButton();
    }

    @And("^I Select Asia Tab$")
    public void iSelectAsiaTab() throws InterruptedException {
        new HomePage().clickOnAsiaTag();
    }

    @And("^Using search box on the top of page, search for currency pair \"([^\"]*)\" and click See overview button$")
    public void usingSearchBoxOnTheTopOfPageSearchForCurrencyPairAndClickSeeOverviewButton(String text)  throws InterruptedException{
        new HomePage().clickOnSearchBox();
        new HomePage().sendText(text);
        new HomePage().iClickOnOverViewButton();

    }

    @Then("^I Verify that I am on correct page$")
    public void iVerifyThatIAmOnCorrectPage() {
        String expectedMessage = "BRITISH POUND / JAPANESE YEN";
                String actualMessage = new HomePage().verifyTextOnPage();
        Assert.assertEquals("Text is not Displayed",expectedMessage,actualMessage);
    }
}
