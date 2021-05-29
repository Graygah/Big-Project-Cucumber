package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjek.LoginPage;
import pageobjek.ManageLeaveNeg;

public class ManageLeaveNegStepsOrangeHRM {
	
	public WebDriver driver;

	public ManageLeaveNegStepsOrangeHRM() throws InterruptedException {
		driver = Hooks.driver;

	}

	@Given("5User on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void visitLoginPage(String uname, String pword) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginAppear());
		loginPage.setUname(uname);
		loginPage.setPword(pword);
		loginPage.clickLoginButton();
		Thread.sleep(5000);
	}

	@When("1I click Leave button")
	public void clickLeaveButton() throws Throwable {
		ManageLeaveNeg Mleave = new ManageLeaveNeg(driver);
		Mleave.clickButtonLeave();

	}
	
	@Then("1I click leave list")
	public void clickApplyButton() throws Throwable{
		ManageLeaveNeg Mleave = new ManageLeaveNeg(driver);
		Mleave.clickButtonViewLeave();
		
	}
	
	@Then("1I select show all")
	public void selectLeaveType() throws Throwable{
		ManageLeaveNeg Mleave = new ManageLeaveNeg(driver);
		Mleave.clickButtonCheckAll();
		
	}
	
	@Then("I input \"(.*)\" as to date")
	public void inputToDate(String todate) throws Throwable{
		ManageLeaveNeg Mleave = new ManageLeaveNeg(driver);
		Mleave.clickToDate(todate);
	}
	
	@Then("1I click search")
	public void chooseFromDate() throws Throwable{
		ManageLeaveNeg Mleave = new ManageLeaveNeg(driver);
		Mleave.clickButtonSearch();
		Thread.sleep(2000);
		Mleave.isTxtToDateErrorAppear();
		
	}

}
