package com.iiiiinetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iiiiinetbanking.pageobject.LoginPage;
import com.iiiiinetbanking.testbase.TestBase;
import com.iiiiinetbanking.utility.Helper;

public class LoginTC_002 extends TestBase {

	@Test
	public void verifyLoginFunctionalityTC_001() {
		LoginPage login = new LoginPage(driver);
		login.setUsername(configDataProvider.getUserName());
		login.setPassword(configDataProvider.getPassword());

		login.clickOnLoginBtn();
		
		Helper.handleAlertPopUp(driver);

		String expTitle = "Guru99 Bank Manager HomePage";
		String actTitle = driver.getTitle();

		System.out.println(actTitle);

		if (expTitle.equals(actTitle)) {
			Assert.assertTrue(true);
			//Helper.captureScreenshot(driver,"HompePage");
			Helper.captureScreenshot(driver);
		} else {
			//Helper.captureScreenshot(driver,"LoginPage");
			Helper.captureScreenshot(driver);
			Assert.assertTrue(false);
			
		}

		// Assert.assertEquals(actTitle, expTitle,"actual browser title doesn't match
		// with expected title");
	}
}
