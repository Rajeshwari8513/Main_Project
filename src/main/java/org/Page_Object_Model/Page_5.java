package org.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_5 {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	public Page_5(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
	     return logout;
	}
}
