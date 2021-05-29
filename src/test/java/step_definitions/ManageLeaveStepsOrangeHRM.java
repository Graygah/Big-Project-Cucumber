package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjek.AssignLeave;
import pageobjek.LoginPage;
import pageobjek.ManageLeave;

public class ManageLeaveStepsOrangeHRM {
	
	public WebDriver driver;

	public ManageLeaveStepsOrangeHRM() throws InterruptedException {
		driver = Hooks.driver;

	}

	@Given("3User on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void visitLoginPage(String uname, String pword) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginAppear());
		loginPage.setUname(uname);
		loginPage.setPword(pword);
		loginPage.clickLoginButton();
		Thread.sleep(5000);
	}

	@When("I click Leave button")
	public void clickLeaveButton() throws Throwable {
		ManageLeave Mleave = new ManageLeave(driver);
		Mleave.clickButtonLeave();

	}
	
	@Then("I click leave list")
	public void clickApplyButton() throws Throwable{
		ManageLeave Mleave = new ManageLeave(driver);
		Mleave.clickButtonViewLeave();
		
	}
	
	@Then("I select show all")
	public void selectLeaveType() throws Throwable{
		ManageLeave Mleave = new ManageLeave(driver);
		Mleave.clickButtonCheckAll();
		
	}
	
	@Then("I click search")
	public void chooseFromDate() throws Throwable{
		ManageLeave Mleave = new ManageLeave(driver);
		Mleave.clickButtonSearch();
		Thread.sleep(1000);
		
	}
	
//	@Then("I select action")
//	public void chooseToDate() throws Throwable{
//		ManageLeave Mleave = new ManageLeave(driver);
//		Assert.assertTrue(Mleave.isFieldAppear());
//		Mleave.DrpAct();
//	}
	
	@Then("I click save in leave list")
	public void choosePartial() throws Throwable{
		ManageLeave Mleave = new ManageLeave(driver);
		Mleave.clickButtonSave();
		
	}

}