package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = {"StepDefinitions"},
        plugin = {"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
        features = {"src/test/java/AppFeatures"}
)

public class GoogleTest extends AbstractTestNGCucumberTests {
    public void setup(){
        System.out.println("TestRunner is running");

    }
}
