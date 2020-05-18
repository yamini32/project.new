package com.pages;

import org.baseclass.Library;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends Library {

	public Pom() {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	

	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement user;
	
	@FindBy(xpath = "//input[@id=\"pass\"]")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@id=\"u_0_b\"]")
	private WebElement login;
	
}
