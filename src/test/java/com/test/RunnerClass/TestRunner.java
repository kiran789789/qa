package com.test.RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(
        features =  "src/test/java/com/test/features",
        glue = {"com/test/glueCode"},
        		dryRun = false,
        		monochrome = true,
		publish = true,
        	    plugin = {
						"json:target/cucumber-reports/AutomationReport.json",
						"json:target/cucumber-reports/cucumber.runtime.formatter.JSONFormatter",
						"pretty", "html:target/cucumber-reports/AutomationReport.html"
				})

public class TestRunner {

}
