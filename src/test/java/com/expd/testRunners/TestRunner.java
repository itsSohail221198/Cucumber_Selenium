package com.expd.testRunners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "@LoginScenarios",
        features = {"feature/"},
        glue = "com.expd.stepDefinitions",
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/ParallelReports/SeleniumTraining.html",
                "json:target/ParallelReports/SeleniumTraining.json"
        }
)
public class TestRunner {
}
