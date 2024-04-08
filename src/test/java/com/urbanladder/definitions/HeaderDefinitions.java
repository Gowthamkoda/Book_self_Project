package com.urbanladder.definitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.urbanladder.actions.BookshelvesPageActions;
import com.urbanladder.actions.HeaderActions;
import com.urbanladder.utils.HelperClass;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HeaderDefinitions {

	HeaderActions objHeaderAction = new HeaderActions();
	BookshelvesPageActions objBookShelfPageAction = new BookshelvesPageActions();
	@Given("navigate to home page")
	public void navigate_to_home_page() {
		
		HelperClass.openPage("https://www.urbanladder.com/");
		
		
	}
	@Given("handle banner")
	public void handle_banner() {
		try {
			objBookShelfPageAction.closePopup();
		}catch (AssertionError e) {
			
			System.err.println(e.getMessage());
		}
		
	}
	@Given("retrive any one SubMenu data from living menu")
	public void LivingSubMenu(){
		
		HelperClass.sleep(2000);
		objHeaderAction.MoveToLivngLabel();
		List<WebElement> chairList = objHeaderAction.ChairList();
		for (WebElement chair : chairList) {
			System.out.println("Chair SubMenu: " + chair.getText());
		}
	}
	
	@When("search for bookshelves")
	public void searched_for_bookshelves() {
		
		try {
		
		Assert.assertEquals(objHeaderAction.CheckSearch(), true,"Search input not found");
		objHeaderAction.SendInput("BookShelves");
			
		Assert.assertEquals(objHeaderAction.CheckSearchButton(), true, "Search button not found");
		objHeaderAction.ClickSearchButton();
		}catch (AssertionError e) {
			System.err.println(e.getMessage());
			
		}
	}
	@Then("display searched results")
	public void display_searched_results() {
		try {
			Assert.assertEquals(objBookShelfPageAction.checkBookShelfUrl(), true,"Page Not Redirected");
			
		}catch (AssertionError e) {
			
			System.err.println(e.getMessage());
			
		}
		
	}



}
