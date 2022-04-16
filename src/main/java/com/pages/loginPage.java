package com.pages;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.Setup;

public class loginPage{
	@SuppressWarnings("Unused")
	private WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement userName;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passWord;

	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement loginBtn;

	public void Login_user(Map<String,String>userDetails) {
		userName.sendKeys(userDetails.get("userName"));
		passWord.sendKeys(userDetails.get("passWord"));
		loginBtn.click();
	}

}
