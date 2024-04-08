package com.urbanladder.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HelperClass {

	private static HelperClass helperClass;

	private static WebDriver driver; 
	public final static int TIMEOUT = 30;

	private HelperClass() {
	driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	}      

	public static void openPage(String url) {
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;              
	}

	public static void setUpDriver() {

		if (helperClass==null) {

			helperClass = new HelperClass();
		}
	}
	
	public static WebDriverWait getWait(long timeDelay) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
	}
	
	public static Actions getHandler() {
		return new Actions(driver);
	}
	public static String getUrl() {
		return driver.getCurrentUrl();
	}

	public static void tearDown() {

		if(driver!=null) {
			driver.close();
			driver.quit();
		}

		helperClass = null;
	}
	
	public static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void log(Scenario scenario, String data) {
		scenario.attach(data, "text/plain", "data");
	}

}