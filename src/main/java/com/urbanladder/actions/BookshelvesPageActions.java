package com.urbanladder.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.urbanladder.locators.BookshelvesPageLocators;
import com.urbanladder.utils.HelperClass;

public class BookshelvesPageActions {
	WebDriver driver; 
	Actions act= new Actions(driver);
	BookshelvesPageLocators bookshelvespagelocator_Obj;
	public BookshelvesPageActions() {
		this.bookshelvespagelocator_Obj = new BookshelvesPageLocators();
		PageFactory.initElements(HelperClass.getDriver(),bookshelvespagelocator_Obj);
	
	}
	//Checks for Prize 
	public boolean CheckPrizeFilter() {
		return bookshelvespagelocator_Obj.price_Filter.isDisplayed();
	}
	//MouseHover to Prize Filter 
	public void MovetoPrizeFilter() {
		act.moveToElement(bookshelvespagelocator_Obj.price_Filter);
	}
	
	//Check for Right Dragger 
	public boolean CheckRightDragger() {
		return bookshelvespagelocator_Obj.Right_Dragger.isDisplayed();
	}
	//Drag And Set the Price to 15000
	public void DragAndSet() {
		act.dragAndDropBy(bookshelvespagelocator_Obj.Right_Dragger, -211, 0).perform();
		
	}
	
	//Check For WallShelves or  Kid Bookshelves 
	public boolean CheckIsElementClickable() {
		if(bookshelvespagelocator_Obj.Kid_Bookshelves_CheckBox.isEnabled()|| bookshelvespagelocator_Obj.Wall_Shelves_CheckBox.isEnabled()){
			return true;
		}
		return false;
	}
	
	//Click  WallShelves or  Kid Bookshelves 
	public void ClickItems() {
		try {
			bookshelvespagelocator_Obj.Kid_Bookshelves_CheckBox.click();
		}catch (Exception e) {

			bookshelvespagelocator_Obj.Wall_Shelves_CheckBox.click();
		}
	}

	//Check for Out Of Stock 
	public boolean CheckOutOfStock() {
		return bookshelvespagelocator_Obj.outOfStock_CheckBox.isDisplayed();
	}
	//Click Out Of Stock 
	public void ExcludeOutOfStock() {
			bookshelvespagelocator_Obj.outOfStock_CheckBox.click();
	}
	//Check For SortBy DropDown
	public boolean CheckDropDown() {
		return bookshelvespagelocator_Obj.outOfStock_CheckBox.isDisplayed();
	}
	
	
	
	
	
	
}
