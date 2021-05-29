package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjek.LoginPage;
import pageobjek.Logout;

public class LogoutStepsOrangeHRM {
	
	public WebDriver driver;

	public LogoutStepsOrangeHRM() throws InterruptedException {
		driver = Hooks.driver;

	}
	
	@Given("4User on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void visitLoginPage(String uname, String pword) throws Throwable{
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginAppear());
		loginPage.setUname(uname);
		loginPage.setPword(pword);
		loginPage.clickLoginButton();
		Thread.sleep(5000);
	}
	
	@When("I in orangehrm for logout")
	public void inOrangeHRM() throws Throwable{
		
	}
	
	@Then("I click my profile")
	public void clickProfile() throws Throwable{
		Logout logout = new Logout(driver);
		logout.clickButtonWelcome();
		Thread.sleep(2000);

	}
	
	@Then("I click logout")
	public void clickLogout() throws Throwable{
		Logout logout = new Logout(driver);
		logout.isLogoutAppear();
		logout.clickButtonLogout();
		logout.isLoginPanelAppear();
	}

}
