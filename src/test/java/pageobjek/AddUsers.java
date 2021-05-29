package pageobjek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.BaseClass;

public class AddUsers {
	public WebDriver driver;
	
	public AddUsers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "menu_admin_viewAdminModule")
	private WebElement BtnAdmin;
	
	@FindBy(id = "btnAdd")
	private WebElement BtnAdd;
	
	@FindBy(id = "systemUser_employeeName_empName")
	private WebElement EmpName;
	
	@FindBy(id = "systemUser_userName")
	private WebElement EmpUname;
	
	@FindBy(id = "systemUser_password")
	private WebElement EmpPword;
	
	@FindBy(id = "systemUser_confirmPassword")
	private WebElement EmpCPword;
	
	@FindBy(id = "btnSave")
	private WebElement BtnSaveU;
	
	public void clickButtonAdmin(){
		 BtnAdmin.click();
	}
	
	public void clickButtonAdd() {
		BtnAdd.click();
	}
	
	public boolean isAddUsersAppear() {
		EmpName.isDisplayed();
		EmpUname.isDisplayed();
		EmpPword.isDisplayed();
		EmpCPword.isDisplayed();
		return true;

	}
	
	public void DrpRole() {
		Select DrpRole = new Select(driver.findElement(By.id("systemUser_userType")));
		DrpRole.selectByValue("1");
	}
	
	
	public void setEmpName(String empname) {
		EmpName.sendKeys(empname);
	}
	
	public void setEmpUName(String empuname) {
		EmpUname.sendKeys(empuname);
	}
	
	public void DrpStat() {
		Select DrpStat = new Select(driver.findElement(By.id("systemUser_status")));
		DrpStat.selectByValue("1");
	}
	public void setEmpPWord(String emppword) {
		EmpPword.sendKeys(emppword);
	}
	
	public void setEmpCPWord(String empcpword) {
		EmpCPword.sendKeys(empcpword);
	}
	
	public void clickButtonSave() {
		BtnSaveU.click();
	}
}
