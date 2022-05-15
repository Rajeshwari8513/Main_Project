package org.Step_Definition;

import java.io.IOException;

import org.Page_Object_Manager.P_O_M;
import org.Property_File.File_Reader;

import com.Main_Project.Base_Class;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	public static P_O_M pom = new P_O_M(driver);
	
	@Before
	public void beforeHooks (Scenario s) {
		String name = s.getName();
		System.out.println("Scenario name:"+ name);
	}
	
	@After
	public void afterHooks(Scenario s) throws IOException {
		String status = s.getStatus();
		System.out.println("Scenario status:"+ status);
		
		if (s.isFailed()) {
			
			takeScreenshot("C:\\Users\\admin\\eclipse-workspace\\Main_Project\\Screenshot\\Adactin.img");
		}
		
	}
	
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		String url = File_Reader.get_fr().get_cr().url();
		launchUrl(url);
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		String username = File_Reader.get_fr().get_cr().username();
		inputValues(pom.getPg_1().getUsername(), username);
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		String password = File_Reader.get_fr().get_cr().password();
		inputValues(pom.getPg_1().getPassword(), password);
	}

	@Then("^user Click The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		Click(pom.getPg_1().getLogin());
	}

	@When("^user Select The Location In The Location Field$")
	public void user_Select_The_Location_In_The_Location_Field() throws Throwable {
		Click(pom.getPg_2().getLocation());
	}

	@When("^user Select The Hotel In The Hotel Field$")
	public void user_Select_The_Hotel_In_The_Hotel_Field() throws Throwable {
		Click(pom.getPg_2().getHotels());
	}

	@When("^user Select The \"([^\"]*)\", (\\d+), \"([^\"]*)\" In The Roomtype Field$")
	public void user_Select_The_In_The_Roomtype_Field(String option, int index, String value) throws Throwable {
		DropDown(option,index,value, pom.getPg_2().getRoom_type());
	}

	@When("^user Select The \"([^\"]*)\", (\\d+), \"([^\"]*)\" In The Roomno Field$")
	public void user_Select_The_In_The_Roomno_Field(String option, int index, String value) throws Throwable {
		DropDown(option, index, value, pom.getPg_2().getRoom_nos());
	}

	@When("^user Select The Datein In The Datein Field$")
	public void user_Select_The_Datein_In_The_Datein_Field() throws Throwable {
		clear(pom.getPg_2().getDatepick_in());
        String datepick_in = File_Reader.get_fr().get_cr().datepick_in();
		inputValues(pom.getPg_2().getDatepick_in(), datepick_in);
	}

	@When("^user Select The Dateout In The Dateout Field$")
	public void user_Select_The_Dateout_In_The_Dateout_Field() throws Throwable {
		clear(pom.getPg_2().getDatepick_out());
		String datepick_out = File_Reader.get_fr().get_cr().datepick_out();
		inputValues(pom.getPg_2().getDatepick_out(), datepick_out);
	}

	@When("^user Select The Adultroom In The Adultroom Field$")
	public void user_Select_The_Adultroom_In_The_Adultroom_Field() throws Throwable {
		Click(pom.getPg_2().getAdult_room());
	}

	@When("^user Select The Childroom In The Childroom Field$")
	public void user_Select_The_Childroom_In_The_Childroom_Field() throws Throwable {
		Click(pom.getPg_2().getChild_room());
	}

	@Then("^user Click The Search Button And It Navigates To The Hotel Availability Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_The_Hotel_Availability_Page() throws Throwable {
		Click(pom.getPg_2().getSubmit());
	}

	@When("^user Click The Radio Button In The Radio Button Field$")
	public void user_Click_The_Radio_Button_In_The_Radio_Button_Field() throws Throwable {
		Click(pom.getPg_3().getRadiobutton_0());
	}

	@Then("^user Click The Continue Button And It Navigates To The Hotel Booking Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Hotel_Booking_Page() throws Throwable {
		Click(pom.getPg_3().getCnt());
	}

	@When("^user Enter The Firstname In The Firstname Field$")
	public void user_Enter_The_Firstname_In_The_Firstname_Field() throws Throwable {
		String firstname = File_Reader.get_fr().get_cr().firstname();
	    inputValues(pom.getPg_4().getFirst_name(), firstname);
	}

	@When("^user Enter The Lastname In The Lastname Field$")
	public void user_Enter_The_Lastname_In_The_Lastname_Field() throws Throwable {
		String lastname = File_Reader.get_fr().get_cr().lastname();
		inputValues(pom.getPg_4().getLast_name(), lastname);
	}

	@When("^user Enter The Address In The Address Field$")
	public void user_Enter_The_Address_In_The_Address_Field() throws Throwable {
		String address = File_Reader.get_fr().get_cr().address();
		inputValues(pom.getPg_4().getAddress(), address);
	}

	@When("^user Enter The Creditcardnumber In The Creditcardnumber Field$")
	public void user_Enter_The_Creditcardnumber_In_The_Creditcardnumber_Field() throws Throwable {
		String cc_num = File_Reader.get_fr().get_cr().cc_num();
		inputValues(pom.getPg_4().getCc_num(), cc_num);
	}

	@When("^user Enter The \"([^\"]*)\", (\\d+), \"([^\"]*)\" In The Creditcardtype Field$")
	public void user_Enter_The_In_The_Creditcardtype_Field(String option, int index, String value) throws Throwable {
		DropDown(option, index, value, pom.getPg_4().getCc_type());
	}

	@When("^user Enter The Creditcardexpirymonth In The Creditcardexpirymonth Field$")
	public void user_Enter_The_Creditcardexpirymonth_In_The_Creditcardexpirymonth_Field() throws Throwable {
		Click(pom.getPg_4().getCc_exp_month());
	}

	@When("^user Enter The \"([^\"]*)\", (\\d+), \"([^\"]*)\" In The Creditcardexpiryyear Field$")
	public void user_Enter_The_In_The_Creditcardexpiryyear_Field(String option, int index, String value) throws Throwable {
		DropDown(option, index, value, pom.getPg_4().getCc_exp_year());
	}

	@When("^user Enter The Cvv In The Cvv Field$")
	public void user_Enter_The_Cvv_In_The_Cvv_Field() throws Throwable {
		String cc_cvv = File_Reader.get_fr().get_cr().cc_cvv();
		inputValues(pom.getPg_4().getCc_cvv(), cc_cvv);
	}

	@Then("^user Click The Booknow Button And It Navigates To The Logout Page$")
	public void user_Click_The_Booknow_Button_And_It_Navigates_To_The_Logout_Page() throws Throwable {
		Click(pom.getPg_4().getBook_now());
	}

	@Given("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
		Click(pom.getPg_5().getLogout());
	}
}
