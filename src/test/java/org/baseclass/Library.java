package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	
	public static WebDriver driver;
	
	public static WebDriver LaunchBrw() {
		
		WebDriverManager.chromedriver().setup();
		return driver = new ChromeDriver();

	}
	
	public static void loadUrl() {
		driver.get("https://www.facebook.com/");
	}

	public static void typeValue(WebElement element , String value) {
		
		element.sendKeys(value);
}
	public static void clickIt(WebElement element) {
		
      element.click();
	}
	
	public static void closeIt() {
		
		driver.quit();
	
	}
}
