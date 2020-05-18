package org.scenarioout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
WebDriver driver;

@Given("user launch chrome browser")
public void user_launch_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}

@Given("user load fb url")
public void user_load_fb_url() {
	driver.get("https://www.facebook.com/");
}

@When("user enter valid credential {string} and <{string}>")
public void user_enter_valid_credential_and(String string, String string2) {
  driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(string);
  driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(string2);
}

@Then("user click login button")
public void user_click_login_button() {
    driver.findElement(By.xpath("//input[@id=\"u_0_b\"]")).click();
}

@Then("user Validate test")
public void user_Validate_test() {
    System.out.println("Sucess");
}

@Given("user load insta url")
public void user_load_insta_url() {
	driver.get("https://www.instagram.com/accounts/login/");
}

@Then("user click insta login button")
public void user_click_insta_login_button() {
   driver.findElement(By.xpath("//div[text()=\"Log In\"]")).click();
}

@When("user enter insta valid credential {string} and <{string}>")
public void user_enter_insta_valid_credential_and(String string, String string2) throws InterruptedException {
	Thread.sleep(3000); 
 driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(string);
  driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(string2);
  
}

}
