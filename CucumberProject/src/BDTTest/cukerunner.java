package BDTTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
features = {"src/"},
plugin = {"pretty","html:targert/cucumber-junit-report","junit:targer/cucumber-junit-report/allcukes.xml"}, 
tags = {"@Runme"}
)

public class cukerunner {
}