package com.urbanladder.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class BookshelvesPageLocators {

	//Category Filter
	@FindBy(xpath="//li[@data-group='category']")  public WebElement category_label;
		
		//Wall Shelves 
		@FindBy(id="filters_primary_category_Wall_Shelves") public WebElement Wall_Shelves_CheckBox;
		// Kid Bookshelves 
		@FindBy(id="filters_primary_category_Kids_Bookshelves") public WebElement Kid_Bookshelves_CheckBox ;
	
	
	//Price Filter 
	@FindBy(xpath="//div[normalize-space()='Price']")
	public WebElement price_Filter;
		
		//Right Dragger
		@FindBy(xpath = "//div[@class='noUi-handle noUi-handle-upper']")public WebElement Right_Dragger;
	
		
	//Out Of Stock CheckBox
	@FindBy(id="filters_availability_In_Stock_Only") public WebElement outOfStock_CheckBox;
	
	//SortBy DropDown
	@FindBy(xpath="//span[normalize-space()='Recommended']") public WebElement SortBy_DropDown;
		
		//Sort By High To Low 
		@FindBy(xpath = "//*[@data-key=\"price_desc\"]") public WebElement HighToLow_Option;
	
		
    //Results
		@FindAll({@FindBy(xpath = "//*[@itemprop='name' and @class='name']")}) public List<WebElement> Results;	
	
		//Close Popup Element	
	@FindBy(xpath="//a[contains(text(),'Close')]")  public WebElement closePopuP;

}
