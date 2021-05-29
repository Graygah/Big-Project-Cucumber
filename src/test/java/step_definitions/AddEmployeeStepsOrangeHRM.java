package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjek.AddEmployee;
import pageobjek.LoginPage;

public class AddEmployeeStepsOrangeHRM {
	
	public WebDriver driver;

	public AddEmployeeStepsOrangeHRM() throws InterruptedException {
		driver = Hooks.driver;
		
	}

	@Given("1User on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void visitLoginPage(String uname, String pword) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginAppear());
		loginPage.setUname(uname);
		loginPage.setPword(pword);
		loginPage.clickLoginButton();
		Thread.sleep(5000);
	}
	
	@When("Click PIM button")
	public void clickPIMButton() throws InterruptedException{
		AddEmployee addemp = new AddEmployee(driver);
		addemp.clickButtonPIM();
		Thread.sleep(3000);
	}
	
	@Then("I go to add employee page")
	public void inUserPage() throws Throwable{
		AddEmployee addemp = new AddEmployee(driver);
		addemp.clickButtonAdd();
		Assert.assertTrue(addemp.isAddEmployeeAppear());
		Thread.sleep(1000);
	}
	
	@Then("I input \"(.*)\" as firstname & \"(.*)\" as lastname")
	public void selectRole(String empfirstn, String emplastn) throws Throwable{	
		AddEmployee addemp = new AddEmployee(driver);
		addemp.setEmpFistN(empfirstn);
		addemp.setEmpLastN(emplastn);
	}
	
	@Then("I input \"(.*)\" as employee id")
	public void inputEmpName(String empid) throws Throwable{
		AddEmployee addemp = new AddEmployee(driver);
		addemp.setEmpId(empid);
	}
	
	@Then("I click create login details")
	public void clickLogDet() throws Throwable{
		AddEmployee addemp = new AddEmployee(driver);
		addemp.clickChkLog();
	}
	
	@Then("I input \"(.*)\" as username")
	public void inputEmpUsername(String usname) throws Throwable{
		AddEmployee addemp = new AddEmployee(driver);
		addemp.setUsName(usname);
	}
	
	@Then("1I input \"(.*)\" as password")
	public void selectStatus(String uspword) throws Throwable{
		AddEmployee addemp = new AddEmployee(driver);
		addemp.setUsPword(uspword);
	}
	
	
	@Then("1I input \"(.*)\" as confirmation password")
	public void inputConfirmationPassword(String uscpword) throws Throwable{
		AddEmployee addemp = new AddEmployee(driver);
		addemp.setUsCPword(uscpword);

	}
	
	@Then("I click save in employee")
	public void clickSave() throws Throwable{
		AddEmployee addemp = new AddEmployee(driver);
		addemp.clickButtonSave();
	}
}
