package com.test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Setup;
import com.pages.cartLandingPage;
import com.pages.checkOutDetails;
import com.pages.checkoutOverveiw;
import com.pages.checkoutSuccessPage;
import com.pages.loginPage;
import com.pages.productListPage;

public class Scenario2Test extends Setup{
	
	@Test
	public void LoginUser() throws InterruptedException {
		
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		//productListPage product = PageFactory.initElements(driver, productListPage.class);
		
		Map<String, String> userDetails = new HashMap<String, String>();
		
		userDetails.put("userName", "standard_user");
		userDetails.put("passWord", "secret_sauce");
		login.Login_user(userDetails);
		
		productListPage product = PageFactory.initElements(driver,productListPage.class);
		Thread.sleep(3000l);
		product.addbutton1.click();
		
		Thread.sleep(3000l);
		product.addbutton1.click();
		
		product.addbutton2.click();
		
		
		
		product.cart.click();
		
		cartLandingPage cart = PageFactory.initElements(driver, cartLandingPage.class);
		
		Thread.sleep(3000l);
		cart.checkOut.click();
		
		checkOutDetails checkout = PageFactory.initElements(driver, checkOutDetails.class);
		Map<String, String> checkoutDetails = new HashMap<String, String>();
		
		checkoutDetails.put("firstName", "abc");
		checkoutDetails.put("lastName", "def");
		checkoutDetails.put("postalCode", "400087");
		
		Thread.sleep(3000l);
		
		checkout.Check_Out(checkoutDetails);
		
		checkoutOverveiw checkOv = PageFactory.initElements(driver, checkoutOverveiw.class);
		
		Thread.sleep(3000l);
		checkOv.finishBtn.click();
		
		checkoutSuccessPage checkSuccess = PageFactory.initElements(driver, checkoutSuccessPage.class);
		
		Thread.sleep(3000l);
		Assert.assertTrue(checkSuccess.successMsg.isDisplayed());
		
		
		
				
		
	}

}
