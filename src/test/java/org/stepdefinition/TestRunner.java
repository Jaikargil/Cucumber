package org.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\jaika\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\GoogleSearch\\facebook.feature",
                 glue="org.stepdefinition",
                 monochrome=true,
                 dryRun=false,
                 strict=false,
                plugin= {"html:HtmlReports","junit:JunitReports\\junitrep.xml","json:JsonReports\\jsonrep.json"})

public class TestRunner {

}
