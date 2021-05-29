package pageobjek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddEmployee {
	public WebDriver driver;

	public AddEmployee(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "menu_pim_viewPimModule")
	private WebElement BtnPIM;

	@FindBy(id = "btnAdd")
	private WebElement BtnAdd;

	@FindBy(id = "firstName")
	private WebElement EmpFirstN;

	@FindBy(id = "lastName")
	private WebElement EmpLastN;

	@FindBy(id = "employeeId")
	private WebElement EmpId;

	@FindBy(id = "chkLogin")
	private WebElement EmpChkLog;

	@FindBy(id = "user_name")
	private WebElement UsName;

	@FindBy(id = "user_password")
	private WebElement UsPword;

	@FindBy(id = "re_password")
	private WebElement UsCPword;
	
	@FindBy(id = "btnSave")
	private WebElement BtnSaveE;

	public void clickButtonPIM() {
		BtnPIM.click();
	}

	public void clickButtonAdd() {
		BtnAdd.click();
	}

	public boolean isAddEmployeeAppear() {
		EmpFirstN.isDisplayed();
		EmpLastN.isDisplayed();
		EmpId.isDisplayed();
		EmpChkLog.isDisplayed();
		return true;

	}

	public void setEmpFistN(String empfirstn) {
		EmpFirstN.sendKeys(empfirstn);
	}

	public void setEmpLastN(String emplastn) {
		EmpLastN.sendKeys(emplastn);
	}
	
	public void setEmpId(String empid) {
		EmpId.sendKeys(empid);
	}

	public void clickChkLog() {
		EmpChkLog.click();
	}

	public void setUsName(String usname) {
		UsName.sendKeys(usname);
	}

	public void setUsPword(String uspword) {
		UsPword.sendKeys(uspword);
	}

	public void setUsCPword(String uscpword) {
		UsCPword.sendKeys(uscpword);
	}

	public void clickButtonSave() {
		BtnSaveE.click();
	}
}