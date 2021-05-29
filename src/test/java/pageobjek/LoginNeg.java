package pageobjek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginNeg {

	public WebDriver driver;

	public LoginNeg(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "txtUsername")
	private WebElement inputUsername;

	@FindBy(id = "txtPassword")
	private WebElement inputPassword;

	@FindBy(id = "btnLogin")
	private WebElement btnLoginButton;

	public boolean isLoginAppear() {
		inputUsername.isDisplayed();
		inputPassword.isDisplayed();
		btnLoginButton.isDisplayed();
		return true;

	}

	public void setUname(String uname) {
		inputUsername.sendKeys(uname);
	}

	public void setPword(String pword) {
		inputPassword.sendKeys(pword);
	}

	public void clickLoginButton() {
		btnLoginButton.click();
	}

}
