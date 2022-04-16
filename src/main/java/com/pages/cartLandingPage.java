package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.Setup;

public class cartLandingPage extends Setup {

	public cartLandingPage(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	public WebElement continueShopping;

	@FindBy(xpath = "//button[contains(.,'Checkout')]")
	public WebElement checkOut;

	// For Going back to Product List page
	public void clickOnContShop() {
		continueShopping.click();
	}

	// For Checkout
	public void clickOnCheckOut() {
		checkOut.click();
	}

}
