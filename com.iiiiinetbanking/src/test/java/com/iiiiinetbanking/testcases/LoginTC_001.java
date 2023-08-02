package com.iiiiinetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iiiiinetbanking.pageobject.LoginPage;
import com.iiiiinetbanking.testbase.TestBase;

public class LoginTC_001 extends TestBase {

	/*@Test
	public void verifyLoginPageTitleTC_001() {
		String expTitle = "GTPL Bank Home Page";
		String actTitle = driver.getTitle();

		if (expTitle.equals(actTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}*/

	@Test
	public void verifyLoginFunctionalityTC_002() {
		LoginPage login = new LoginPage(driver);
		login.setUsername("mngr513669");
		login.setPassword("mupeteg");

		login.clickOnLoginBtn();

		String expTitle = "GTPL Bank Manager HomePage";
		String actTitle = driver.getTitle();
		
		System.out.println(actTitle);

		if (expTitle.equals(actTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
