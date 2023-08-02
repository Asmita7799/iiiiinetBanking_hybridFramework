package com.iiiiinetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(name = "uid")
	WebElement txt_username;

	@FindBy(name = "password")
	WebElement txt_password;

	@FindBy(name = "btnLogin")
	WebElement LoginBtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String username) {
		txt_username.clear();
		txt_username.sendKeys(username);
	}

	public void setPassword(String password) {
		txt_password.clear();
		txt_password.sendKeys(password);
	}

	public HomePage clickOnLoginBtn() {
		LoginBtn.click();
		return new HomePage(driver);
	}
}
