package com.tradingview.pages;

import com.tradingview.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//div[@class='actionBtn-WvyPjcpY']/button[2]")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//div[contains(@class,'__area--user')]/button[1]")
    WebElement signInButton;

    @CacheLookup
    @FindBy(xpath = "//button[@data-name='header-user-menu-sign-in']")
    WebElement headerSignInButton;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Email']")
    WebElement emailTab;

    @CacheLookup
    @FindBy(xpath = "//input[@name='username']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Asia')]")
    WebElement asiaTag;

    @CacheLookup
    @FindBy(xpath = "//div[@class='tv-header-search-container']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//input[@name='query']")
    WebElement searchInput;

   @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'British Pound/Japanese Yen')]")
    WebElement britishTab;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'See overview')]")
    WebElement clickOnOverViewButton;


    @CacheLookup
    @FindBy(xpath = "//h1[text()='British Pound / Japanese Yen']")
    WebElement verifyText;


    public void setAcceptCookies() {
        clickOnElement(acceptCookies);
        log.info("Accept cookies  : " + acceptCookies.toString());
    }

    public void clickOnSignButton() {
        clickOnElement(signInButton);
        log.info("Clicking on signIn button : " + signInButton.toString());
    }

    public void clickOnHeaderSignInButton() {
        clickOnElement(headerSignInButton);
        log.info("Clicking on header Sign In button : " + headerSignInButton.toString());
    }

    public void clickEmailTab() {
        clickOnElement(emailTab);
        log.info("Clicking on emailTab: " + emailTab.toString());
    }


    public void enterEmail(String email) {
        clickOnElement(emailField);
        log.info("Clicking on emailField : " + emailField.toString());
        sendTextToElement(emailField, email);
        log.info("Enter email : " + emailField.toString());


    }

    public void enterPassword(String password) {
        clickOnElement(passwordField);
        log.info("Click on password : " + passwordField.toString());
        sendTextToElement(passwordField, password);
        log.info("Enter the password : " + passwordField.toString());


    }

    public void clickOnSubmitButton() {
        clickOnElement(submitButton);
        log.info("Clicking on submit button : " + submitButton.toString());


    }

    public void clickOnAsiaTag() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(asiaTag);
        log.info("Clicking on asia tag : " + asiaTag.toString());

    }

    public void clickOnSearchBox() {
        clickOnElement(searchButton);
        log.info("Clicking on SearchBox : " + searchButton.toString());

    }

    public void sendText(String text) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(searchInput, text);
        log.info("Entering on emailField : " + searchInput.toString());

    }

    public void iClickOnOverViewButton() throws InterruptedException   {
        mouseHoverToElement(britishTab);
        log.info("Hover on british tab : " + britishTab.toString());
        Thread.sleep(1000);
        clickOnElement(clickOnOverViewButton);
        log.info("Clicking on overview button : " + clickOnOverViewButton.toString());


    }

    public String verifyTextOnPage(){
        log.info("Verify Text on displayed : " + verifyText.toString());
        return getTextFromElement(verifyText);
    }



}


