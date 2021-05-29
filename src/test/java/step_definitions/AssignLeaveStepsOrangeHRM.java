package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjek.AssignLeave;
import pageobjek.LoginPage;

public class AssignLeaveStepsOrangeHRM {

	public WebDriver driver;

	public AssignLeaveStepsOrangeHRM() throws InterruptedException {
		driver = Hooks.driver;

	}

	@Given("2User on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void visitLoginPage(String uname, String pword) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginAppear());
		loginPage.setUname(uname);
		loginPage.setPword(pword);
		loginPage.clickLoginButton();
		Thread.sleep(5000);
	}

	@When("Click Leave button")
	public void clickLeaveButton() throws Throwable {
		AssignLeave leave = new AssignLeave(driver);
		leave.clickButtonLeave();

	}
	
	@Then("I click assign leave")
	public void clickApplyButton() throws Throwable{
		AssignLeave leave = new AssignLeave(driver);
		leave.clickButtonApply();
		Thread.sleep(3000);
		Assert.assertTrue(leave.isFieldAppear());
		
	}
	
	@Then("I input \"(.*)\" as employee name in assign leave")
	public void inputEmployeeName(String empname) throws Throwable{
		AssignLeave leave = new AssignLeave(driver);
		leave.setEmpName(empname);
	}
	
	@Then("I select leave type")
	public void selectLeaveType() throws Throwable{
		AssignLeave leave = new AssignLeave(driver);
		leave.DrpLeave();
		
	}
	
	@Then("I choose from date")
	public void chooseFromDate() throws Throwable{
		AssignLeave leave = new AssignLeave(driver);
		leave.chooseFromDate();
		leave.chooseFromTgl();
		Thread.sleep(1000);
		
	}
	
	@Then("I choose to date")
	public void chooseToDate() throws Throwable{
		AssignLeave leave = new AssignLeave(driver);
		leave.chooseToDate();
		leave.chooseToTgl();
		Thread.sleep(1000);
		
	}
	
	@Then("I choose partial days & duration")
	public void choosePartial() throws Throwable{
		AssignLeave leave = new AssignLeave(driver);
		leave.DrpPart();
		Thread.sleep(1000);
		
	}
	
	@Then("I input \"(.*)\" as a comment")
	public void inputComment(String appcom) throws Throwable{
		AssignLeave leave = new AssignLeave(driver);
		leave.setComment(appcom);
		
	}
	
	@Then("Click apply")
	public void clickApply() throws Throwable{
		AssignLeave leave = new AssignLeave(driver);
		leave.clickButtonApply();
		
	}

}