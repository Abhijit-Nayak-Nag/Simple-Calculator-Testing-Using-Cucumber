package com.calculator.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.calculator"} // path of the step definition file.
//        plugin = {"pretty", "html:target/cucumber-reports.html"},
//        monochrome = true
//        tags = "@Calculator"
)
public class TestRunner {

}


//Test Runner File with Tags:
//Create a directory structure src/test/java/com/example/testrunner and inside it, update TestRunner.java:



