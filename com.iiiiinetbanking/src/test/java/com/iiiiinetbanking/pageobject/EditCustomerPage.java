package com.iiiiinetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerPage {

	
	WebDriver driver;
	
	@FindBy(name="XYZ")
	WebElement customerDetails;
	
	public EditCustomerPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void editCustomerDetails()
	{
		
	}
}
