package com.cucumberFramework.setpdefinitions;

import org.openqa.selenium.By;

import com.cucumberFramework.pageObjects.LoginPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions extends TestBase {
	LoginPage loginPage = new LoginPage(driver);

	@Given("^I am on the Login page URL \"([^\"]*)\"$")
	public void i_am_on_the_Login_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@Then("^I should see Log In Page$")
	public void i_should_see_Log_In_Page() throws Throwable {
		// driver.findElement(By.xpath("//*[@id=\"com-form-login\"]/div[1]/input")).isDisplayed();
		// driver.findElement(By.xpath("//input[@ name ='log'])")).isDisplayed();
		//loginPage.userName.isDisplayed();
		 driver.findElement(By.id("email")).isDisplayed();

	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		// driver.findElement(By.xpath("//*[@id=\"com-form-login\"]/div[1]/input")).sendKeys(arg1);
		// driver.findElement(By.xpath("//input[@ name ='log'])")).sendKeys(arg1);
		loginPage.enterUserName(arg1);

	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		// driver.findElement(By.xpath("//*[@id
		// ='com-form-login']/div[2]/input")).sendKeys(arg1);
		// driver.findElement(By.xpath("//input[@name = 'pwd']")).sendKeys(arg1);
		loginPage.enterPassword(arg1);
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		// driver.findElement(By.xpath("//input[@name='user-submit']")).click();
		loginPage.clickLoginButton();
	}

//	@Then("^I should see application homepage$")
//	public void i_should_see_application_homepage() throws Throwable {
//	    
//	}
//
//	@Then("^I should see administrator text message$")
//	public void i_should_see_administrator_text_message() throws Throwable {
//	    
//	}
//
//	@Then("^I should see administrator text message on home page$")
//	public void i_should_see_administrator_text_message_on_home_page() throws Throwable {
//	    
//	}

}
