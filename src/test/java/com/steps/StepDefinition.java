package com.steps;

import org.baseclass.Library;

import com.pages.Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Library{
	
@Given("user launch chrome browser")
public void user_launch_chrome_browser() {
	
	LaunchBrw();
	}

@Given("user load url")
public void user_load_url() {
    loadUrl();
}

@When("user enter valid credential")
public void user_enter_valid_credential() {
    Pom obj = new Pom();
    typeValue(obj.getUser(), "yamini");
    typeValue(obj.getPass(), "pass087");
}

@Then("user click login button")
public void user_click_login_button() {
    Pom obj = new Pom();
    clickIt(obj.getLogin());
}

@Then("user Validate test")
public void user_Validate_test() {
    System.out.println("user Validate test");
}



}
