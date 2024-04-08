package com.urbanladder.definitions;

import com.urbanladder.actions.GiftCardSPageAction;
import com.urbanladder.locators.GiftCardSPageLocators;
import com.urbanladder.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCardsDefinitions {
	GiftCardSPageAction  giftcardspageaction_Obj = new GiftCardSPageAction();
	GiftCardSPageLocators giftcardspageLocators_Obj = new GiftCardSPageLocators();

	@Given("Click on GiftCards Label")
	public void click_on_gift_cards_label() {
		giftcardspageaction_Obj.ClickOngiftCard();

	}
	@Given("Select Birthday\\/Anniversary Option")
	public void select_birthday_anniversary_option() {
		giftcardspageaction_Obj.ClickOnBirthdaORAnniversary();

	}
	@Given("Enter Amount {string} and Select Date and Month")
	public void enter_amount_and_select_date_and_month(String amount) {
		giftcardspageaction_Obj.EnterAmount(amount);
		giftcardspageaction_Obj.SelectMonthandDate();
		giftcardspageaction_Obj.ClickOnNextButton();

	}
	@Given("Fill To {string}, {string}, {string} details")
	public void fill_to_details(String name, String Email, String phone) {
		giftcardspageaction_Obj.EnterRecipientName(name);
		giftcardspageaction_Obj.EnterRecipientEmail(Email);
		giftcardspageaction_Obj.EnterRecipientMobile(phone);
	}
	@When("Fill From  {string}, {string}, {string}, {string}, {string} details")
	public void fill_from_details(String name, String Email, String phone, String address, String pinocode) {
		giftcardspageaction_Obj.EnterYourName(name);
		giftcardspageaction_Obj.EnterYourEmail(Email);
		giftcardspageaction_Obj.EnterYourMobile(phone);
		giftcardspageaction_Obj.EnterYourAddress(address);
		giftcardspageaction_Obj.EnterYourPincode(pinocode);
		giftcardspageaction_Obj.ClickOnConfirm();
		HelperClass.sleep(3000);


	}

	@Then("Validate the Displayed Details {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void validate_the_displayed_details(String amount, String toName, String toEmail, String toPhone, String yourName, String yourEmail, String yourPhone, String address, String pincode, String message) {
		
		System.err.println("Status: "+message);
		/*if(message.equals("Invaild Email"))
		*///{
//			System.out.println("Pass");
//			try {
//				String text = giftcardspageLocators_Obj.yourEmail_Input.getAttribute("validationMessage");
//				System.out.println("text:"+text);
//			}catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
	}
}
//		}
		//}
//		else if(message.equals("Vaild Email")){
//			System.out.println("Fail");
//		}

//		System.out.println(message.toLowerCase().trim().toString().contains("invalid email")+"     "+message.toLowerCase().toString().contains("valid email"));
//		System.out.println(message.toLowerCase().trim().toString().equalsIgnoreCase("invalid email")+"     "+message.toLowerCase().trim().toString().equalsIgnoreCase("valid email"));
		
//		try {
//			String text = giftcardspageLocators_Obj.yourEmail_Input.getAttribute("validationMessage");
//			System.out.println("text:"+text);
//		}catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
		
		
		
//		if (message.toLowerCase().contains("invalid email")) {
//		String text = giftcardspageLocators_Obj.yourEmail_Input.getAttribute("validationMessage");
//		System.out.println("text:"+text);
//		}
//		
//		else if (message.toLowerCase().contains("valid email")){
//			System.out.println("valid email");
//			String text = giftcardspageLocators_Obj.Amount_Output.getText();
//			System.out.println("text:"+text);
//		}
//		else {
//			System.out.println("Mistake");
//		}
		
//		if(giftcardspageLocators_Obj.Amount_Output.getText().replace(",", "").contains(amount)) {
//			System.out.println("Amount Verrification Succesful");
//
//		}else {
//			System.out.println("Amount MisMatch");
//		}
//
//		if(giftcardspageLocators_Obj.recipientsName_Output.getText().equalsIgnoreCase(toName)) {
//			System.out.println("Name Verification Succesful");
//		}
//		else {
//			System.out.println("Name MisMatch");
//		}
//
//		if(giftcardspageLocators_Obj.recipientsEmail_Output.getText().equalsIgnoreCase(toEmail)) {
//			System.out.println("Email Verfication Successful");
//		}
//		else {
//			System.out.println("Email MisMatch");
//		}
//
//		if(giftcardspageLocators_Obj.recipientsEmail_Output.getText().equalsIgnoreCase(toPhone))
//		{
//			System.out.println("Mobile No Verrification Succesful");
//
//		}else {
//			System.out.println("Mobile No MisMatch");
//		}
//		if (giftcardspageLocators_Obj.pincode_Output.getText().contains(pincode)) {
//			System.out.println("pincode Verification Successful");
//		} else {
//			System.out.println("pincode Mismatch");
//		}
//		if (giftcardspageLocators_Obj.yourName_Output.getText().equalsIgnoreCase(yourName)) {
//			System.out.println("Name Verification Successful");
//		} else {
//			System.out.println("Name Mismatch");
//		}
//
//		if (giftcardspageLocators_Obj.yourEmail_Output.getText().equalsIgnoreCase(yourEmail)) {  
//			System.out.println("Email Verification Successful");
//		} else {
//			System.out.println("Email Mismatch");
//		}
//
//		if (giftcardspageLocators_Obj.Address_Output.getText().equalsIgnoreCase(address)) {
//			System.out.println("address Verification Successful");
//		} else {
//			System.out.println("address Mismatch");
//		}
		
//		HelperClass.sleep(2000);
		
		//			(message.equalsIgnoreCase("Invaild Email")) {
		//				String validationMsg = giftcardspageLocators_Obj.yourEmail_Input.getAttribute("validationMessage");
		//				System.out.println(validationMsg);
	





