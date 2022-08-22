package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='orangehrm-login-branding']")
	WebElement logo;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement user;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath="//div[@class='oxd-topbar-header-title']")
	WebElement pIM;
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	WebElement clickUser;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	public void orangeLogo()
	{
		logo.isDisplayed();
	}
	public void enterUser(String eUser)
	{
		user.sendKeys(eUser);
	}
	public void enterPassword(String ePassword)
	{
		password.sendKeys(ePassword);
	}
	public void clickedOnLoginBtn()
	{
		login.click();
	}
	public void verifyPIM()
	{
		pIM.isDisplayed();
	}
	public void clickOnUser()
	{
		clickUser.isDisplayed();
	}
	public void clickOnLogout()
	{
		logout.click();
	}
}
