package ru.googleSearch;

import org.junit.Before;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import ru.googleSearch.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

  private MainPage mainPage;

  @BeforeClass
  public void openUrl() {
    mainPage = new MainPage();
    open("https://google.com");
  }
}
