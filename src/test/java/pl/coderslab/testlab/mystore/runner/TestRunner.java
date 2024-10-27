package pl.coderslab.testlab.mystore.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/pl/coderslab/testlab/mystore/features",
        glue = {"pl.coderslab.testlab.mystore.stepdefinitions", "pl.coderslab.testlab.mystore.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports/report.html"},
        tags = "(@done or @ui) and not @bug"
)
public class TestRunner {
}
