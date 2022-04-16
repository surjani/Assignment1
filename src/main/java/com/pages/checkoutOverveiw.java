package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutOverveiw extends loginPage {

	public checkoutOverveiw(WebDriver driver) {

		super(driver);

	}
	
	@FindBy(xpath = "//button[@id='finish']")
	public WebElement finishBtn;
	
	@FindBy(xpath = "//button[@id='cancel']")
	public WebElement cancelBtn;
	
	//Final Checkout
	public void clcikOnFinish() {
		finishBtn.click();
	}
	
	//Cancel Checkout
	public void clickOnCancel() {
		cancelBtn.click();
	}

}
