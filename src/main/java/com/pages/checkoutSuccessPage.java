package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutSuccessPage extends loginPage {

	public checkoutSuccessPage(WebDriver driver) {

		super(driver);

	}

	@FindBy(xpath = "//h2[contains(.,'THANK YOU FOR YOUR ORDER')]")
	public WebElement successMsg;

}
