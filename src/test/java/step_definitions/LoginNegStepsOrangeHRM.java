package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageobjek.LoginNeg;

public class LoginNegStepsOrangeHRM {
	
	public WebDriver driver;

	public LoginNegStepsOrangeHRM() {
		driver = Hooks.driver;

	}

	@Given("In orangehrm login page again for login negative")
	public void visitLoginPage() throws Throwable {
		LoginNeg loginneg = new LoginNeg(driver);
		Assert.assertTrue(loginneg.isLoginAppear());
	}

	@When("I using \"(.*)\" as username and \"(.*)\" as password for login negative")
	public void inputCredential(String uname, String pword) throws Throwable {
		LoginNeg loginneg = new LoginNeg(driver);
		loginneg.setUname(uname);
		loginneg.setPword(pword);
		loginneg.clickLoginButton();
	}

}
