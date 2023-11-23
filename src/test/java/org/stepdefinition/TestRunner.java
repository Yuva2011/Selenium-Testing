package org.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
glue = "org.stepdefinition", 
monochrome = true, 
dryRun = false,
plugin = {"html:report","junit:report\\junitreport.xml","json:report\\jsonreport.json"},
snippets = SnippetType.CAMELCASE )
public class TestRunner {

}
