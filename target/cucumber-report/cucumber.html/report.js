$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page",
  "description": "As user I want to sign in to the application",
  "id": "home-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8013436900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should Navigate to sign in page",
  "description": "",
  "id": "home-page;user-should-navigate-to-sign-in-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Email button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter email \"test01041998@outlook.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter password \"Vivek1998\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on email sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Select Asia Tab",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Using search box on the top of page, search for currency pair \"FX:GBPJPY\" and click See overview button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Verify that I am on correct page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 161934200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickOnSignInButton()"
});
formatter.result({
  "duration": 491066800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickOnEmailButton()"
});
formatter.result({
  "duration": 652237200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test01041998@outlook.com",
      "offset": 15
    }
  ],
  "location": "HomePageSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 492779300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vivek1998",
      "offset": 18
    }
  ],
  "location": "HomePageSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 237286900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickOnEmailSignInButton()"
});
formatter.result({
  "duration": 194560200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iSelectAsiaTab()"
});
formatter.result({
  "duration": 4861416200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FX:GBPJPY",
      "offset": 63
    }
  ],
  "location": "HomePageSteps.usingSearchBoxOnTheTopOfPageSearchForCurrencyPairAndClickSeeOverviewButton(String)"
});
formatter.result({
  "duration": 8636571200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iVerifyThatIAmOnCorrectPage()"
});
formatter.result({
  "duration": 359211800,
  "status": "passed"
});
formatter.after({
  "duration": 984356500,
  "status": "passed"
});
});