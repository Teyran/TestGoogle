package ru.googleSearch.Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import ru.googleSearch.MainPage;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class MainPageDefs {
  MainPage mainPage = new MainPage();


  @Given("Open {string}")
  public void open_google_com(String domain) {
    open("https://"+ domain);
  }

  @Then("Type to input with name: {string} text: {string} and press Enter")
  public void type_to_input_with_name_text(String string, String string2) {
    $(byName(string)).val(string2).pressEnter();
  }

  @Then("Displays searching results with id: {string} and site with domain: {string} is visible")
  public void displaysSearchingResultsWithIdAndSiteIsVisible(String elementId, String domain) {
    $(byId(elementId)).shouldBe(visible).shouldHave(text(domain));
  }

  @Then("Website with domain: {string} is visible and Go to that website")
  public void siteWithDomainIsVisibleInSearchingResults(String arg0) {
    $(byText(arg0)).shouldBe(visible).click();
  }

  @And("selling rate for USD is greater than the purchase rate")
  public void sellingRateForUSDIsGreaterThanThePurchaseRate() {
    String buyRate = $(By.xpath("//table[@class='main-page-exchange__table main-page-exchange__table--online']//tr[2]/td[4]")).getText();
    String sellRate = $(By.xpath("//table[@class='main-page-exchange__table main-page-exchange__table--online']//tr[2]/td[2]")).getText();
    Assert.assertTrue(Float.parseFloat(buyRate.replace(",",".")) > Float.parseFloat(sellRate.replace(",",".")), "Selling rate for USD not greater then buying rate");
  }

  @And("selling rate for EUR is greater than the purchase rate")
  public void sellingRateForEURIsGreaterThanThePurchaseRate() {
    String buyRate = $(By.xpath("//table[@class='main-page-exchange__table main-page-exchange__table--online']//tr[3]/td[4]")).getText();
    String sellRate = $(By.xpath("//table[@class='main-page-exchange__table main-page-exchange__table--online']//tr[3]/td[2]")).getText();
    Assert.assertTrue(Float.parseFloat(buyRate.replace(",",".")) > Float.parseFloat(sellRate.replace(",",".")), "Selling rate for EUR not greater then buying rate");
  }
}