package com.cucumberFramework.setpdefinitions;

import com.cucumberFramework.enums.Browser;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks {

	TestBase testBase;

	@Before
	public void initializeTest() {
		testBase = new TestBase();
		testBase.selectBrowser(Browser.CHROME.name());

	}

	@After
	public void endTest() {
		TestBase.driver.quit();
	}

}
