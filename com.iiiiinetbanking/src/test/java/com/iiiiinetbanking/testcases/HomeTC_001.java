package com.iiiiinetbanking.testcases;

import org.testng.Assert;


import com.iiiiinetbanking.pageobject.HomePage;
import com.iiiiinetbanking.pageobject.LoginPage;

import com.iiiiinetbanking.testbase.TestBase;
import com.iiiiinetbanking.utility.Helper;

public class HomeTC_001 extends TestBase {

//	@Test
//	public void navifateToNewCustomerTC_001()
//	{
//		LoginPage login = new LoginPage(driver);
//		
//
//		String username = excelDataProvider.getStringCellData("Login", 1, 0);
//		String password = excelDataProvider.getStringCellData("Login", 1, 1);
//		//String expTitle = excelDataProvider.getStringCellData("Login", 1, 2);
//
//		login.setUsername(username);
//		login.setPassword(password);
//
//		HomePage homepage = login.clickOnLoginBtn();
//	    homepage.clickOnNewCustomerLink();
//	    
//	    System.out.println(driver.getTitle());
//		
//	}
	
	public void verifyLogOutFunctionality() throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		

		String username = excelDataProvider.getStringCellData("Login", 1, 0);
		String password = excelDataProvider.getStringCellData("Login", 1, 1);
		

		login.setUsername(username);
		login.setPassword(password);

		HomePage homepage = login.clickOnLoginBtn();
		
		Thread.sleep(3000);
		
	    homepage.clickOnLogOutLink();
	    
	    Helper.handleAlertPopUp(driver);
	    
	    String actTitle = driver.getTitle();
	    String expTitle = "Guru99 Bank Home Page";
	    
	    if(actTitle.equals(expTitle))
	    {
	    	Assert.assertTrue(true);
	    	//Helper.captureScreenshot(driver,"LoginPage");
	         Helper.captureScreenshot(driver);
	    }
	    else
	    {
	    	//Helper.captureScreenshot(driver,"HompePage");
	    	Helper.captureScreenshot(driver);
	    	Assert.assertTrue(false);
	    }
		
	}
}
