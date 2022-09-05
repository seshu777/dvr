package testCases;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import testBase.BaseClass;

public class TC_001_LoginPage extends BaseClass {
	
@Test
public void loginPage()
{
	LoginPage lp=new LoginPage(driver);
	lp.orangeLogo();
	lp.enterUser("Admin");
	lp.enterPassword("admin123");
	lp.clickedOnLoginBtn();
	lp.verifyPIM();
	lp.clickOnUser();
	lp.clickOnLogout();
	lp.orangeLogo();
	lp.quit();
}
}
