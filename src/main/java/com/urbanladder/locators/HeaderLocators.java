package com.urbanladder.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderLocators {
	
	//Search 
	@FindBy(xpath="//input[@id='search']") public WebElement search_input;
	@FindBy(xpath="//*[@class='search-icon icofont-search']") public WebElement search_button;
	
	//Living
	@FindBy(xpath="//*[@class=\"topnav_item livingunit\"]") public WebElement living_Option;
	
	
	
	//Gift Cards
	@FindBy(xpath="(//a[@class='featuredLinksBar__link'])[3]") public WebElement giftCardS_link;
	
}
