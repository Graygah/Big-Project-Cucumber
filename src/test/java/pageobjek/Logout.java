package pageobjek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	public WebDriver driver;

	public Logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "welcome")
	private WebElement BtnWelcome;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement BtnLogout;
	
	@FindBy(id = "logInPanelHeading")
	private WebElement TxtPanel;
	
	public void clickButtonWelcome() {
		BtnWelcome.click();
	}
	
	public boolean isLogoutAppear() {
		BtnWelcome.isEnabled();
		return true;
		
	}
	
	public void clickButtonLogout() {
		BtnLogout.click();
	}
	
	public boolean isLoginPanelAppear() {
		TxtPanel.isDisplayed();
		return true;
	}
}
