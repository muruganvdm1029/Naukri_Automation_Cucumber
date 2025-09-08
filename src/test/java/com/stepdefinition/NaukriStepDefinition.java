package com.stepdefinition;

import java.io.IOException;

import com.base.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmanager.PageObjectManager;

public class NaukriStepDefinition extends Base_Class {

	PageObjectManager pageObjectManager = new PageObjectManager();

	@Given("user must Launch The Browser")
	public void user_must_launch_the_browser() throws IOException {

		// PageObjectManager pageObjectManager=new PageObjectManager();

		launchBrowser(pageObjectManager.getFileReader().getDataProperty("browser"));
		launchUrl(pageObjectManager.getFileReader().getDataProperty("url"));
	}

	@When("user must Click The Login Button")
	public void user_must_click_the_login_button() {
		pageObjectManager.getLoginpage().getLogin();

	}

	@When("user must Enter The Valid User Name in the {string} User Name Field")
	public void user_must_enter_the_valid_user_name_in_the_user_name_field(String string) {
		pageObjectManager.getLoginpage().getUsername(string);
	}

	@When("user must Enter The Valid Password in the {string} Password Field")
	public void user_must_enter_the_valid_password_in_the_password_field(String string) {
		pageObjectManager.getLoginpage().getPassword(string);
	}

	@Then("user must click the login button and its navigate to the homepage {string}")
	public void user_must_click_the_login_button_and_its_navigate_to_the_homepage(String string) {
		pageObjectManager.getLoginpage().getLoginb();
	}

}
