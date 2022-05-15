$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/org/Feature_File/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking The Hotel Booking Functionality Of An Adactin Application",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2745500,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The Username In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Password In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 11059855500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Username_In_The_Username_Field()"
});
formatter.result({
  "duration": 582375700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Password_In_The_Password_Field()"
});
formatter.result({
  "duration": 212165500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1751741100,
  "status": "passed"
});
formatter.after({
  "duration": 360500,
  "status": "passed"
});
formatter.before({
  "duration": 199600,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Search Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;search-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user Select The Location In The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Select The Hotel In The Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Select The \"Selectbyindex\", 2, \"0\" In The Roomtype Field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select The \"selectByValue\", 0, \"2\" In The Roomno Field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select The Datein In The Datein Field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select The Dateout In The Dateout Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select The Adultroom In The Adultroom Field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select The Childroom In The Childroom Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Click The Search Button And It Navigates To The Hotel Availability Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_In_The_Location_Field()"
});
formatter.result({
  "duration": 234673900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_In_The_Hotel_Field()"
});
formatter.result({
  "duration": 157555500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selectbyindex",
      "offset": 17
    },
    {
      "val": "2",
      "offset": 33
    },
    {
      "val": "0",
      "offset": 37
    }
  ],
  "location": "Step_Definition.user_Select_The_In_The_Roomtype_Field(String,int,String)"
});
formatter.result({
  "duration": 864307800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selectByValue",
      "offset": 17
    },
    {
      "val": "0",
      "offset": 33
    },
    {
      "val": "2",
      "offset": 37
    }
  ],
  "location": "Step_Definition.user_Select_The_In_The_Roomno_Field(String,int,String)"
});
formatter.result({
  "duration": 297798900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Datein_In_The_Datein_Field()"
});
formatter.result({
  "duration": 369795000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Dateout_In_The_Dateout_Field()"
});
formatter.result({
  "duration": 331715700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Adultroom_In_The_Adultroom_Field()"
});
formatter.result({
  "duration": 116007900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Childroom_In_The_Childroom_Field()"
});
formatter.result({
  "duration": 117134500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Search_Button_And_It_Navigates_To_The_Hotel_Availability_Page()"
});
formatter.result({
  "duration": 1750421900,
  "status": "passed"
});
formatter.after({
  "duration": 220600,
  "status": "passed"
});
formatter.before({
  "duration": 258700,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Hotel Availability Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;hotel-availability-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "user Click The Radio Button In The Radio Button Field",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user Click The Continue Button And It Navigates To The Hotel Booking Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Radio_Button_In_The_Radio_Button_Field()"
});
formatter.result({
  "duration": 160991100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Continue_Button_And_It_Navigates_To_The_Hotel_Booking_Page()"
});
formatter.result({
  "duration": 1306483300,
  "status": "passed"
});
formatter.after({
  "duration": 166200,
  "status": "passed"
});
formatter.before({
  "duration": 202600,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Hotel Booking Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;hotel-booking-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user Enter The Firstname In The Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user Enter The Lastname In The Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Enter The Address In The Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Enter The Creditcardnumber In The Creditcardnumber Field",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Enter The \"SelectByVisibleText\", 0, \"VISA\" In The Creditcardtype Field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Enter The Creditcardexpirymonth In The Creditcardexpirymonth Field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Enter The \"SelectByValue\", 0, \"2022\" In The Creditcardexpiryyear Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enter The Cvv In The Cvv Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Click The Booknow Button And It Navigates To The Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Firstname_In_The_Firstname_Field()"
});
formatter.result({
  "duration": 278172400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Lastname_In_The_Lastname_Field()"
});
formatter.result({
  "duration": 253586200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Address_In_The_Address_Field()"
});
formatter.result({
  "duration": 351085200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Creditcardnumber_In_The_Creditcardnumber_Field()"
});
formatter.result({
  "duration": 257569700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SelectByVisibleText",
      "offset": 16
    },
    {
      "val": "0",
      "offset": 38
    },
    {
      "val": "VISA",
      "offset": 42
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Creditcardtype_Field(String,int,String)"
});
formatter.result({
  "duration": 273277900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Creditcardexpirymonth_In_The_Creditcardexpirymonth_Field()"
});
formatter.result({
  "duration": 106371900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SelectByValue",
      "offset": 16
    },
    {
      "val": "0",
      "offset": 32
    },
    {
      "val": "2022",
      "offset": 36
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Creditcardexpiryyear_Field(String,int,String)"
});
formatter.result({
  "duration": 259008100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Cvv_In_The_Cvv_Field()"
});
formatter.result({
  "duration": 200874700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Booknow_Button_And_It_Navigates_To_The_Logout_Page()"
});
formatter.result({
  "duration": 175651700,
  "status": "passed"
});
formatter.after({
  "duration": 279500,
  "status": "passed"
});
formatter.before({
  "duration": 175700,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Logout Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;logout-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "user Click The Logout Button",
  "keyword": "But "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Logout_Button()"
});
formatter.result({
  "duration": 1650219500,
  "status": "passed"
});
});