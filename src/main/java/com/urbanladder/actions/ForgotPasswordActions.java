package com.urbanladder.actions;

import org.openqa.selenium.support.PageFactory;

import com.urbanladder.locators.ForgotPasswordLocators;
import com.urbanladder.utils.HelperClass;

public class ForgotPasswordActions {

	ForgotPasswordLocators forgotPasswordLocators = null;
	   
	public ForgotPasswordActions() {
    	
		this.forgotPasswordLocators = new ForgotPasswordLocators();

		PageFactory.initElements(HelperClass.getDriver(),forgotPasswordLocators);
    }
 
    // Get the Heading of Forgot Password page
    public String getForgotPasswordPageText() {
        return forgotPasswordLocators.ForgotPasswordHeading.getText();
    }
}