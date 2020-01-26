package ru.googleSearch;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
                 features = "src/test/resources/features",
                 glue = "ru.googleSearch")
public class RunCucumberTest {

}
