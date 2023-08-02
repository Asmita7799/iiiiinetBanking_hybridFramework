package com.iiiiinetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	WebDriver driver;
	
	@FindBy(linkText = "New Customer")
	WebElement newCustomerLink;
	
	@FindBy(linkText = "Edit Account")
	WebElement editCustomerLink;
	
	@FindBy(linkText = "Log out")
	WebElement logOutLink;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public NewCustomerPage clickOnNewCustomerLink()
	{
		newCustomerLink.click();
		return new NewCustomerPage(driver);
		
	}
	public EditCustomerPage clickOnEditCustomerLink()
	{
		editCustomerLink.click();
		return new EditCustomerPage(driver);
	}
	public void clickOnLogOutLink()
	{
		logOutLink.click();
	}
}
