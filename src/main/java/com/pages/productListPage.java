package com.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class productListPage extends loginPage {

	public productListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//@FindBy(xpath = "//div[@class='inventory_item_name']")
	//public WebElements item[];
	
	/*@FindBy(xpath = "//div[@class='inventory_item_name']")
	public WebElement item1;*/
	
	/*@FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]")
	public WebElement item1;*/
	
	@FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]/following::button")
	public WebElement addbutton1;
	
	@FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Bike Light')]/following::button")
	public WebElement addbutton2;

	/*@FindBy(xpath = "//*[@class='pricebar']/following::button")
	public List<WebElement> buttons;*/

	@FindBy(xpath = "//select[@class='product_sort_container']")
	public WebElement filter;

	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	public WebElement cart;

	// For adding or removing items to or from the card
	public void clickOnProduct() {
		addbutton1.click();
	}
	
	/*public void selectProduct(WebElement e, String s) {
		Select select = new Select(e);
		select.selectByVisibleText(s);
		System.out.println("ytfydyuddr");
	}
*/
	

	// For sorting the item
	public void setFilter() {
		Select select = new Select(filter);
		select.selectByVisibleText("Price (low to high)");

	}

	// For going to the cart
	public void clickOnCart() {
		cart.click();

	}

}
