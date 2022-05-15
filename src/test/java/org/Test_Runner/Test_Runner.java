package org.Test_Runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Main_Project.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\Feature_File\\Adactin.feature" , glue = "org.Step_Definition",
              monochrome=true, dryRun=false,strict=true,                  
              plugin = {"html:Report", "json:Report/cucumber.json", "pretty",
            		  "com.cucumber.listener.ExtentCucumberFormatter:Report/Extent.html"})
public class Test_Runner {
public static WebDriver driver;
 
 @BeforeClass
 public static void setBrowser() {
	driver = Base_Class.bowserLaunch("chrome");
}
 
 @AfterClass
 public static void browserClose() {
    Base_Class.close();	
 }
 
}
