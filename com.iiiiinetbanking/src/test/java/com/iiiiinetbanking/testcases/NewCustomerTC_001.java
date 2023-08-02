package com.iiiiinetbanking.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iiiiinetbanking.pageobject.HomePage;
import com.iiiiinetbanking.pageobject.LoginPage;
import com.iiiiinetbanking.pageobject.NewCustomerPage;
import com.iiiiinetbanking.testbase.TestBase;

public class NewCustomerTC_001 extends TestBase {

	NewCustomerPage newCustomer;
	int row = 1;

//	@Test(priority = 1)
//	public void verifyNewCustomerTC_001() {
//		LoginPage login = new LoginPage(driver);
//		login.setUsername(excelDataProvider.getStringCellData("Login", 1, 0));
//		login.setPassword(excelDataProvider.getStringCellData("Login", 1, 1));
//
//		HomePage homepage = login.clickOnLoginBtn();
//
//		newCustomer = homepage.clickOnNewCustomerLink();
//		String actTitle = newCustomer.verifyNewCustomerPageTitle();
//		// String expTitle = "Guru99 Bank New Customer Entry Page";
//
//		if (actTitle.contains("New Customer")) {
//			Assert.assertTrue(true);
//			System.out.println("Navigate to " + driver.getTitle());
//		} else {
//			Assert.assertTrue(false);
//		}
//	}

//	@Test(priority = 2)
//	public void newCustomerTC_002()
//	{
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		
//		newCustomer.setCustomerName("Asmita");
//		newCustomer.selectGender("Female");
//		newCustomer.setDoB("19-05-2021");
//		newCustomer.setAddress("Mahavir Chauk");
//		newCustomer.setCity("Jalna");
//		newCustomer.setState("Maharashtra");
//		newCustomer.setPin("431207");
//		newCustomer.setMobile("9876543210");
//		newCustomer.setEmail("Ashu22@4gmail.com");
//		newCustomer.setPassword("Ash@34256$");
//		newCustomer.clickOnSubmitBtn();
//		
//		String successMsg=driver.findElement(By.xpath("//p[text()='Customer Registered Successfully!!!']")).getText();
//		System.out.println(successMsg);
//		
//		String customerID = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
//		System.out.println(customerID);//	59470
//	}
//
	@Test(dataProvider = "fetchExcelTestData")

	public void createNewCustomerTC_002(String customerName, String gender, String dob, String address, String city,
			String state, String pin, String Mobile, String email, String password) 
	{
//		System.out.println(customerName + "   " + gender + "   " + dob + "   " + address + "   " + city + "   " + state
//				+ "   " + pin + "   " + Mobile + "   " + email + "   " + password);
		LoginPage login = new LoginPage(driver);
		login.setUsername(excelDataProvider.getStringCellData("Login", 1, 0));
		login.setPassword(excelDataProvider.getStringCellData("Login", 1, 1));

		HomePage homepage = login.clickOnLoginBtn();

		newCustomer = homepage.clickOnNewCustomerLink();
		
		
		newCustomer.setCustomerName(customerName);
		newCustomer.selectGender(gender);
		newCustomer.setDoB(dob);
		newCustomer.setAddress(address);
		newCustomer.setCity(city);
		newCustomer.setState(state);
		newCustomer.setPin(pin);
		newCustomer.setMobile(Mobile);
		newCustomer.setEmail(email);
		newCustomer.setPassword(password);
		newCustomer.clickOnSubmitBtn();
		
		String successMsg=driver.findElement(By.xpath("//p[text()='Customer Registered Successfully!!!']")).getText();
		System.out.println(successMsg);
		
		String customerID = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		System.out.println(customerID);//27943 98433 99721
//		
//		excelDataProvider.rowCount("newCustomer");
		
		try {
			excelDataProvider.setStringCellData("newCustomer", row, customerID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		row = row+1;
		
	
		

	}

	@DataProvider()
	public Object[][] fetchExcelTestData() {
		Object[][] data = excelDataProvider.getExcelTestData("newCustomer");
		return data;
	}

}
