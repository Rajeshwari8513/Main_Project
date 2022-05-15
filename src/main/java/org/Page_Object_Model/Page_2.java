package org.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_2 {
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']/option[6]")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']/option[3]")
	private WebElement hotels;
	
	@FindBy(name = "room_type")
	private WebElement room_type;
	
	@FindBy(name = "room_nos")
	private WebElement room_nos;
	
	@FindBy(name = "datepick_in")
	private WebElement datepick_in;
	
	@FindBy(name = "datepick_out")
	private WebElement datepick_out;
	
	@FindBy(xpath = "//select[@name='adult_room']/option[3]")
	private WebElement adult_room;
	
	@FindBy(xpath = "//select[@name='child_room']/option[2]")
	private WebElement child_room;
	
	@FindBy(id = "Submit")
	private WebElement Submit;
	
	public Page_2(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return Submit;
	}
}
