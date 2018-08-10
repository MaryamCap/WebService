package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class LoginPage {

	WebDriver driver;

//	@FindBy(id = "email")
//	public WebElement userName;
//
//	@FindBy(id = "pass")
//	WebElement password;
//
//	@FindBy(xpath = "//input[@type='submit']")
//	WebElement loginButton;
	
	WebElement userName = driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("pass"));
	WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
	

	WaitHelper waitHelper;

	public LoginPage(WebDriver driver) {

		// when local and global variable is same using this keyword
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.WaitForElement(userName, 60);

	}

	public void enterUserName(String userName) {
		this.userName.sendKeys(userName);

	}

	public void enterPassword(String password) {
		this.password.sendKeys(password);

	}

	public void clickLoginButton() {
		loginButton.click();

	}
}
