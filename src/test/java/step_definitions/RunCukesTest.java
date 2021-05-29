package step_definitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@AdminAddEmployee,@AdminAddUsers,@Leave,@Login,@Logout,@ManageLeave"},
		features = {"classpath:features/"},
		glue = { "classpath:step_definitions"},
		plugin = {"pretty", "html:target/cucumber-html-report.html","json:target/cucumber.json"}
		)
public class RunCukesTest{
	
}