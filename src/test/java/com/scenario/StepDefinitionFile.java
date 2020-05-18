package com.scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionFile {

	WebDriver driver;
	
@Given("user launch chrome browser")
public void user_launch_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
  
}

@Given("user load url")
public void user_load_url() {
    driver.get("https://www.facebook.com/");
}

@When("user enter valid credential")
public void user_enter_valid_credential() {
    driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("yamini");
    driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("pass");
}

@Then("user click login button")
public void user_click_login_button() {
	driver.findElement(By.xpath("//input[@id=\"u_0_b\"]")).click();
}

@Then("user Validate test")
public void user_Validate_test() {
    System.out.println("Valid Credantials");
}

@When("user enter Invalid credential")
public void user_enter_Invalid_credential() {
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("pari");
    driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("pass");
}

@When("user enter valid singup details")
public void user_enter_valid_singup_details() {
	driver.findElement(By.xpath("//input[@id=\"u_0_m\"]")).sendKeys("yamini");
    driver.findElement(By.xpath("//input[@id=\"u_0_o\"]")).sendKeys("sudha");
}

@When("user enter invalid signup details")
public void user_enter_invalid_signup_details() {
	driver.findElement(By.xpath("//input[@id=\"u_0_m\"]")).sendKeys("murali");
    driver.findElement(By.xpath("//input[@id=\"u_0_o\"]")).sendKeys("bala");
}

@When("user enter samle details")
public void user_enter_samle_details() {
	driver.findElement(By.xpath("//input[@id=\"u_0_m\"]")).sendKeys("yamini");
    driver.findElement(By.xpath("//input[@id=\"u_0_o\"]")).sendKeys("bala");
}



}
