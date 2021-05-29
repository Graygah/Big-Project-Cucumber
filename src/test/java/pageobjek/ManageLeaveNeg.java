package pageobjek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageLeaveNeg {
	
	public WebDriver driver;

	public ManageLeaveNeg(WebDriver driver) {
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
	
	@FindBy(id = "calToDate")
	private WebElement BtnToDate;
	
	@FindBy(id = "btnSearch")
	private WebElement BtnSearch;
	
	@FindBy(xpath = "//span[.='To date should be after from date']")
	private WebElement TxtToDateError;
	
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
	
	public void clickToDate(String todate) {
		BtnToDate.clear();
		BtnToDate.sendKeys(todate);
	}
	
	public void clickButtonSearch() {
		BtnSearch.click();
	}
	
	public boolean isTxtToDateErrorAppear() {
		TxtToDateError.isDisplayed();
		return true;
	}


}
