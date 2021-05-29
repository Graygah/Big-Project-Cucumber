package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjek.HomePageBP;
import pageobjek.LoginPage;

public class LoginStepsOrangeHRM {
	
	public WebDriver driver;

	public LoginStepsOrangeHRM() {
		driver = Hooks.driver;

	}

	@Given("I in orangehrm login page")
	public void visitLoginPage() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginAppear());
	}

	@When("Input using \"(.*)\" as username and \"(.*)\" as password")
	public void inputCredential(String uname, String pword) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUname(uname);
		loginPage.setPword(pword);
		loginPage.clickLoginButton();
	}
}