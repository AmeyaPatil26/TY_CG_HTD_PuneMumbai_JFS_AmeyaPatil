package com.capgemini.cucumberdemo.stepdefinition;



import java.util.List;
import java.util.Map;

import javax.sound.sampled.LineListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition {

	static {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
	}
	WebDriver driver;
	@Given("^the user has loaded the application in the browser$")
	public void the_user_has_loaded_the_application_in_the_browser() throws Throwable {
	    driver = new ChromeDriver();
	    driver.get("http://demo.actitime.com/");
	}

	@When("^the user enters the valid username$")
	public void the_user_enters_the_valid_username() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("admin");
	}

	@When("^the user enters the valid password$")
	public void the_user_enters_the_valid_password() throws Throwable {
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("^the user clicks on the login button$")
	public void the_user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

	@Then("^the dashboard page must be displayed$")
	public void the_dashboard_page_must_be_displayed() throws Throwable {
		String actual = driver.getTitle();
		String expected = "actiTIME - Login";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
		
	}

	@When("^the user enters the invalid password$")
	public void the_user_enters_the_invalid_password() throws Throwable {
		driver.findElement(By.name("pwd")).sendKeys("bdnmsd");

	}

	@Then("^the user should be in the same page$")
	public void the_user_should_be_in_the_same_page() throws Throwable {
		String actual = driver.getTitle();
		String expected = "actiTIME - Login";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();

	}
	
	@When("^the user enters \"([^\"]*)\" in the username textbox$")
	public void the_user_enters_in_the_username_textbox(String arg1) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(arg1);
	}

	@When("^the user enters \"([^\"]*)\" in the password textbox$")
	public void the_user_enters_in_the_password_textbox(String arg1) throws Throwable {
		driver.findElement(By.name("pwd")).sendKeys(arg1);
	}
//
//	@When("^the user enters username in the username textbox$")
//	public void the_user_enters_username_in_the_username_textbox(DataTable dataTable) throws Throwable {
//	 List<List<String>> data  = dataTable.asLists(String.class);
//	 driver.findElement(By.id("username")).sendKeys(data.get(1).get(1));
//	}

	//By maps
	@When("^the user enters username in the username textbox$")
	public void the_user_enters_username_in_the_username_textbox(DataTable dataTable) throws Throwable {
	 List<Map<String, String>> data  = dataTable.asMaps(String.class, String.class);
	 driver.findElement(By.id("username")).sendKeys(data.get(0).get("usernames"));
	}

	@When("^the user enters password in the password textbox$")
	public void the_user_enters_password_in_the_password_textbox(DataTable dt1) throws Throwable {
		List<List<String>> data  = dt1.asLists(String.class);
		 driver.findElement(By.name("pwd")).sendKeys(data.get(0).get(0));
	}


	

}
