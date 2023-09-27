package crunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/cfeatures/",
        glue = {"ctests","helper"},
        tags = "@RegressionTest",
        monochrome = true,
        publish = true
)

public class runnerCucumber extends AbstractTestNGCucumberTests {
}
