package pageobjek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageLeave {
	
	public WebDriver driver;

	public ManageLeave(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "menu_leave_viewLeaveModule")
	private WebElement BtnLeave;

	@FindBy(id = "menu_leave_viewLeaveList")
	private WebElement BtnVLeave;
	
	@FindBy(id = "leaveList_chkSearchFilter_checkboxgroup_allcheck")
	private WebElement ChkAll;

	@FindBy(id = "leaveList_cmbWithTerminated")
	private WebElement ChkLeave;
	
	@FindBy(id = "btnSearch")
	private WebElement BtnSearch;
	
	@FindBy(xpath = "//th[.='Date']")
	private WebElement EmpDate;
	
	@FindBy(xpath = "//th[.='Employee Name']")
	private WebElement EmpName;
	
	@FindBy(xpath = "//span[.='Actions']")
	private WebElement EmpActions;
	
	@FindBy(id = "btnSave")
	private WebElement BtnSaveM;
	
	public void clickButtonLeave() {
		BtnLeave.click();
	}

	public void clickButtonViewLeave() {
		BtnVLeave.click();
	}
	
	public void clickButtonCheckAll() {
		ChkAll.click();
	}
	
	public void clickButtonCheckLeave() {
		ChkLeave.click();
	}
	
	public void clickButtonSearch() {
		BtnSearch.click();
	}

	public boolean isFieldAppear() {
		EmpDate.isDisplayed();
		EmpName.isDisplayed();
		EmpActions.isDisplayed();
		return true;

	}
	
//	public void DrpAct() {
//		Select DrpAct = new Select(driver.findElement(By.className("select_action quotaSelect")));
//		DrpAct.selectByValue("97");
//	}
	
	public void clickButtonSave() {
		BtnSaveM.click();
	}

}
