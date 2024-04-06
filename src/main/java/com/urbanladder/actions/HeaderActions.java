package com.urbanladder.actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.urbanladder.locators.HeaderLocators;
import com.urbanladder.utils.HelperClass;

public class HeaderActions {
	WebElement driver;
	Actions act ;
	HeaderLocators headerLocators_Obj= null;
	//Constructor   
	public HeaderActions() {

		this.headerLocators_Obj = new HeaderLocators();
		PageFactory.initElements(HelperClass.getDriver(),headerLocators_Obj);
	}

	//1)Checks for Search Input 
	public boolean CheckSearch(){
		return isDisplayed(headerLocators_Obj.search_Input);
	}
	//Search for "BookShelves"
	public void SendInput(String input) {
		headerLocators_Obj.search_Input.sendKeys(input);
	}

	//2)Checks for Search Button 
	public boolean CheckSearchButton(){
		return isDisplayed(headerLocators_Obj.search_Button);
	}
	//Click on Search Button
	public void ClickSearchButton() {
		headerLocators_Obj.giftCardS_Link.click();
	}

	//3)Check for Living Label 
	public boolean CheckLivngLabel() {
		return isDisplayed(headerLocators_Obj.living_Label);
	}
	//Mouse Hover to living
	public void MoveToLivngLabel(){
		act.moveToElement(headerLocators_Obj.living_Label);
	}

	//4)Check for Chair and SubMenu
	public boolean CheckChairMenu() {
		return isDisplayed(headerLocators_Obj.Chair_Menu); 
	}
	//Find SubMenus of Chair
	public List<WebElement> ChairList(){

		return headerLocators_Obj.Chair_SubMenu;

	}

	//5)Check for LvingStorage and SubMenu
	public boolean CheckLivngStorageMenu() {
		return isDisplayed(headerLocators_Obj.LivingStorage_Menu); 
	}
	//Find SubMenus of Living
	public List<WebElement> LivingStorageList(){

		return headerLocators_Obj.LivingStorage_SubMenu;

	}

	//6)Checks for GiftCards Label
	public boolean CheckGiftCards() {
		return isDisplayed(headerLocators_Obj.giftCardS_Link);
	} 
	//Click on Gift Cards 
	public void ClickGiftCards() {
		headerLocators_Obj.giftCardS_Link.click();
	}

	
	
	
	
	private boolean isDisplayed(WebElement giftCardS_link) {

		return false;
	}
}
