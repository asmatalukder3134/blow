package stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\shapl\\eclipse-workspace"
		+ "\\mavenBluefly\\src\\main\\java\\feature"},glue= {"stepdef"})
public class Runner {

}
