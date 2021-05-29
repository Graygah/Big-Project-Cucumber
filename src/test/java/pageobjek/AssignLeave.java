package pageobjek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AssignLeave {
	
	public WebDriver driver;

	public AssignLeave(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "menu_leave_viewLeaveModule")
	private WebElement BtnLeave;

	@FindBy(id = "menu_leave_assignLeave")
	private WebElement BtnAssign;

	@FindBy(id = "assignleave_txtEmployee_empName")
	private WebElement EmpName;
	
	@FindBy(id = "assignleave_txtFromDate")
	private WebElement FrmDate;
	
	@FindBy(xpath = "//a[.='5']")
	private WebElement FromTgl;

	@FindBy(id = "assignleave_txtToDate")
	private WebElement ToDate;
	
	@FindBy(xpath = "//a[.='24']")
	private WebElement ToTgl;

	@FindBy(id = "assignleave_txtComment")
	private WebElement TxtComment;
	
	@FindBy(id = "assignBtn")
	private WebElement BtnSaveA;
	
	public void clickButtonLeave() {
		BtnLeave.click();
	}

	public void clickButtonApply() {
		BtnAssign.click();
	}

	public boolean isFieldAppear() {
		FrmDate.isDisplayed();
		ToDate.isDisplayed();
		TxtComment.isDisplayed();
		return true;

	}
	
	public void setEmpName(String empname) {
		EmpName.sendKeys(empname);
	}
	
	public void DrpLeave() {
		Select DrpLeave = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		DrpLeave.selectByValue("2");
	}

	public void chooseFromDate() {
		FrmDate.click();
//		FrmDate.sendKeys(fromdate);
	}

	public void chooseFromTgl() {
		FromTgl.click();
	}

	public void chooseToDate() {
		ToDate.click();
//		ToDate.sendKeys(todate);
	}
	
	public void chooseToTgl() {
		ToTgl.click();
	}
	
	public void DrpPart() {
		Select DrpPart = new Select(driver.findElement(By.id("assignleave_partialDays")));
		DrpPart.selectByValue("all");
		
	}
	
	public void setComment(String appcom) {
		TxtComment.sendKeys(appcom);
	}
	
	public void clickButtonSave() {
		BtnSaveA.click();
	}

}
