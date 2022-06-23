Feature: Checking The Hotel Booking Functionality Of An Adactin Application
Scenario: Login Functionality
Given user Must Launch The Url
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click The Login Button And It Navigates To The Search Hotel Page

Scenario: Search Hotel Functionality
When user Select The Location In The Location Field
And user Select The Hotel In The Hotel Field
And user Select The "Selectbyindex", 2, "0" In The Roomtype Field
And user Select The "selectByValue", 0, "2" In The Roomno Field
And user Select The Datein In The Datein Field
And user Select The Dateout In The Dateout Field
And user Select The Adultroom In The Adultroom Field
And user Select The Childroom In The Childroom Field
Then user Click The Search Button And It Navigates To The Hotel Availability Page

Scenario: Hotel Availability Functionality
When user Click The Radio Button In The Radio Button Field
Then user Click The Continue Button And It Navigates To The Hotel Booking Page

Scenario: Hotel Booking Functionality
When user Enter The Firstname In The Firstname Field
And user Enter The Lastname In The Lastname Field
And user Enter The Address In The Address Field
And user Enter The Creditcardnumber In The Creditcardnumber Field
And user Enter The "SelectByVisibleText", 0, "VISA" In The Creditcardtype Field
And user Enter The Creditcardexpirymonth In The Creditcardexpirymonth Field
And user Enter The "SelectByValue", 0, "2022" In The Creditcardexpiryyear Field
And user Enter The Cvv In The Cvv Field
Then user Click The Booknow Button And It Navigates To The Logout Page

Scenario: Logout Functionality
Then user Click The Logout Button







  