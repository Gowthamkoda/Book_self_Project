package com.urbanladder.actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.urbanladder.locators.BookshelvesPageLocators;
import com.urbanladder.utils.HelperClass;

public class BookshelvesPageActions {
	
	Actions handler = HelperClass.getHandler();
	BookshelvesPageLocators bookshelvespagelocator_Obj;
	
	
	
	public BookshelvesPageActions() {
		this.bookshelvespagelocator_Obj = new BookshelvesPageLocators();
		PageFactory.initElements(HelperClass.getDriver(),bookshelvespagelocator_Obj);
	
	}
	
	public boolean checkBookShelfUrl() {
		return HelperClass.getUrl().contains("BookShelves");
		
	}
	
	//Checks for Prize 
	public boolean CheckPrizeFilter() {
		return bookshelvespagelocator_Obj.price_Filter.isDisplayed();
	}
	//MouseHover to Prize Filter 
	public void MovetoPrizeFilter() {
		handler.moveToElement(bookshelvespagelocator_Obj.price_Filter);
	}
	
	//Check for Right Dragger 
	public boolean CheckRightDragger() {
		return bookshelvespagelocator_Obj.Right_Dragger.isDisplayed();
	}
	//Drag And Set the Price to 15000
	public void DragAndSet() {
		handler.dragAndDropBy(bookshelvespagelocator_Obj.Right_Dragger, -211, 0).perform();
		
	}
	//Check For Category Filter
	public boolean CheckCategoryFilter() {
		return bookshelvespagelocator_Obj.category_Filter.isDisplayed();
	}
	
	//Mouse Hover to Category 
	public void MoveToCategory() {
		bookshelvespagelocator_Obj.category_Filter.click();
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
		return bookshelvespagelocator_Obj.SortBy_DropDown.isDisplayed();
	}
	//House Hover to DropDown
	public void MovetoDropDown() {
		handler.moveToElement(bookshelvespagelocator_Obj.SortBy_DropDown);
	}
	//Check For High To Low Option
	public boolean CheckHightoLow() {
		return bookshelvespagelocator_Obj.HighToLow_Option.isDisplayed();
	}
	//Click on  High To Low Option
	public void ClickHighToLow() {
		bookshelvespagelocator_Obj.HighToLow_Option.click();
	}
	
	
	//Check and return the Results Displayed
	public List<WebElement> Results() {
		try{
			return bookshelvespagelocator_Obj.Results;
		}catch(Exception e) {
			System.out.println("No Results Found to Display");
			return null;
		}
	}
	
}
	

	
	
	

