package com.iiiiinetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iiiiinetbanking.pageobject.LoginPage;
import com.iiiiinetbanking.testbase.TestBase;

public class LoginTC_003 extends TestBase {

	@Test
	public void verifyLoginFunctionalityTC_001() {
		LoginPage login = new LoginPage(driver);

		/*
		 * String username = excelDataProvider.getStringCellData(0, 1, 0); String
		 * password = excelDataProvider.getStringCellData(0, 1, 1); String expTitle =
		 * excelDataProvider.getStringCellData(0, 1, 2);
		 */
		String username = excelDataProvider.getStringCellData("Login", 1, 0);
		String password = excelDataProvider.getStringCellData("Login", 1, 1);
		String expTitle = excelDataProvider.getStringCellData("Login", 1, 2);

		login.setUsername(username);
		login.setPassword(password);

		login.clickOnLoginBtn();

		if (expTitle.equals(driver.getTitle())) {
			Assert.assertTrue(true);

			System.out.println("Login Successful..!!");
		} else {
			System.out.println("Login Failed..!!");
			Assert.assertTrue(false);
		}

	}

}
