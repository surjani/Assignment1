package com.pages;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkOutDetails extends loginPage {

	public checkOutDetails(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='first-name']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@id='last-name']")
	public WebElement lastName;

	@FindBy(xpath = "//input[contains(@id,'postal-code')]")
	public WebElement postalCode;

	@FindBy(xpath = "//button[@id='cancel']")
	public WebElement cancelCheckout;

	@FindBy(xpath = "//input[@id='continue']")
	public WebElement continueShopping;

	// For Checkout
	public void Check_Out(Map<String, String> checkoutDetails) {
		firstName.sendKeys(checkoutDetails.get("firstName"));
		lastName.sendKeys(checkoutDetails.get("lastName"));
		postalCode.sendKeys(checkoutDetails.get("postalCode"));
		continueShopping.click();

	}

	// For CancelCheckout
	public void clickOnCancelCheckout() {
		cancelCheckout.click();

	}

}
