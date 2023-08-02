package com.iiiiinetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {

	WebDriver driver;
	
	//Object repository for new Customer page
	
	@FindBy(name="name")
	WebElement txt_newCustomer;
	
	@FindBy(xpath="//input[@type='radio' and @value='m']")
	WebElement MaleradioBtn;
	
	@FindBy(xpath="//input[@type='radio' and @value='f']")
	WebElement FemaleradioBtn;
	
	@FindBy(name="dob")
	WebElement txt_Dob;
	
	@FindBy(name="addr")
	WebElement txt_Address;
	
	@FindBy(name="city")
	WebElement txt_City;
	
	@FindBy(name="state")
	WebElement txt_State;
	
	@FindBy(name="pinno")
	WebElement txt_Pin;
	
	@FindBy(name="telephoneno")
	WebElement txt_Mobile;
	
	@FindBy(name="emailid")
	WebElement txt_Email;
	
	@FindBy(name="password")
	WebElement txt_Password;
	
	@FindBy(name="sub")
	WebElement SubmitBtn;
	
	
	
	public NewCustomerPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyNewCustomerPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public void setCustomerName(String customername)
	{
		txt_newCustomer.clear();
		txt_newCustomer.sendKeys(customername);
	}
	public void selectGender(String gender)
	{
		if(gender.equals("Male")) 
		{
			MaleradioBtn.click();
		}
		else
		{
			FemaleradioBtn.click();
		}
		
	}
	
	public void setDoB(String dob)
	{
		//20-05-1999
		String[] date = dob.split("-");
		String day = date[0];
		String month = date[1];
		String year = date[2];
		
		txt_Dob.sendKeys(day);
		txt_Dob.sendKeys(month);
		txt_Dob.sendKeys(year);
	}

	public void setAddress(String address)
	{
		txt_Address.clear();
		txt_Address.sendKeys(address);
	}
	public void setCity(String city)
	{
		txt_City.clear();
		txt_City.sendKeys(city);
	}
	public void setState(String state)
	{
		txt_State.clear();
		txt_State.sendKeys(state);
	}
	public void setPin(String address)
	{
		txt_Pin.clear();
		txt_Pin.sendKeys(address);
	}
	public void setMobile(String mobile)
	{
		txt_Mobile.clear();
		txt_Mobile.sendKeys(mobile);
	}
	public void setEmail(String email)
	{
		txt_Email.clear();
		txt_Email.sendKeys(email);
	}
	public void setPassword(String password)
	{
		txt_Password.clear();
		txt_Password.sendKeys(password);
	}
	public void clickOnSubmitBtn() 	{
		try {
			Thread.sleep(2000);
			SubmitBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

