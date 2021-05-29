package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjek.AddUsers;
import pageobjek.LoginPage;

public class AddUserStepsOrangeHRM {
	
	public WebDriver driver;
	
	public AddUserStepsOrangeHRM() throws InterruptedException {
		driver = Hooks.driver;
		
	}
	@Given("User on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void visitLoginPage(String uname, String pword) throws Throwable{
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginAppear());
		loginPage.setUname(uname);
		loginPage.setPword(pword);
		loginPage.clickLoginButton();
		Thread.sleep(5000);
	}
	
	@When("Click Admin button")
	public void clickAdminButton(){
		AddUsers adduser = new AddUsers(driver);
		adduser.clickButtonAdmin();
	}
	
	@Then("I go to add user page")
	public void inUserPage() throws Throwable{
		AddUsers adduser = new AddUsers(driver);
		adduser.clickButtonAdd();
		Assert.assertTrue(adduser.isAddUsersAppear());
	}
	
	@Then("I select user role")
	public void selectRole() throws Throwable{	
		AddUsers adduser = new AddUsers(driver);
		adduser.DrpRole();
	}
	
	@Then("I input using \"(.*)\" as employee name")
	public void inputEmpName(String empname) throws Throwable{
		AddUsers adduser = new AddUsers(driver);
		adduser.setEmpName(empname);
	}
	
	@Then("I input using \"(.*)\" as username")
	public void inputEmpUsername(String empuname) throws Throwable{
		AddUsers adduser = new AddUsers(driver);
		adduser.setEmpUName(empuname);
	}
	
	@Then("I select status")
	public void selectStatus() throws Throwable{
		AddUsers adduser = new AddUsers(driver);
		adduser.DrpStat();
	}
	
	@Then("I input \"(.*)\" as password")
	public void inputEmpPassword(String emppword) throws Throwable{
		AddUsers adduser = new AddUsers(driver);
		adduser.setEmpPWord(emppword);
		
	}
	
	@Then("I input \"(.*)\" as confirmation password")
	public void inputEmpCPassword(String empcpword) throws Throwable{
		AddUsers adduser = new AddUsers(driver);
		adduser.setEmpCPWord(empcpword);
		Thread.sleep(1000);
	}
	
	@Then("I click save in users")
	public void clickSave() throws Throwable{
		AddUsers adduser = new AddUsers(driver);
		adduser.clickButtonSave();
	}
}
	
	
	
	
	