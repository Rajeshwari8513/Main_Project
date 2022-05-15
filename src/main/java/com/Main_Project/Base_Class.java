package com.Main_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Base_Class {
     
public static WebDriver driver;
public static Actions sr;
public static Select srj;
//bowserlaunch

	public static WebDriver bowserLaunch(String browsername ) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		 }
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\gecko.exe");
		    driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		}	
		return driver;
	}
//close
	public static void close() {
		driver.close();
	}
//quit
	public static void quit() {
       driver.quit();
	}
//Navigate To
	public static void navigateTo(String Value) {
		driver.navigate().to(Value);
	}
//Navigate back
	public static void navigateBack() {
		driver.navigate().back();
	}
//Navigate forward
	public static void navigateForward() {
	    driver.navigate().forward();
	}
//Navigate Refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
//Get
	public static void launchUrl(String url) {
		driver.get(url);
	}
//Alert
	public static void accept() {
		driver.switchTo().alert().accept();
	}
	public static void dismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void promptAlert(String type) {
		driver.switchTo().alert().sendKeys(type);
		driver.switchTo().alert().accept();
	}
//Mouse Actions
   public static void clickActions() {
	  sr = new Actions(driver);
	  sr.click().build().perform();
	 }
   public static void contextClick(WebElement element) {
	   sr.contextClick(element).build().perform();
	}	
	public static void doubleClick(WebElement element) {
		sr.doubleClick(element).build().perform();
	}
	public static void moveToElement(WebElement element) {
        sr.moveToElement(element).build().perform();
	}
    public static void dragAndDrop(WebElement element) {
	   sr.clickAndHold(element).build().perform();
	   sr.clickAndHold(element).build().perform();
    } 
//Frames
    public static void singleFrame(String frametype, String element, String index, String id ) {
		if (frametype.equalsIgnoreCase(id)) {
			driver.switchTo().frame(id);
		}
		else if (frametype.equalsIgnoreCase(element)) {
			driver.switchTo().frame(element);
		}
		else if (frametype.equalsIgnoreCase(index)) {
			driver.switchTo().frame(index);
		}
		else if (frametype.equalsIgnoreCase("parentframe")){
			driver.switchTo().parentFrame();
		}
		else if (frametype.equalsIgnoreCase("defaultcontent")) {
			driver.switchTo().defaultContent();
		}
	}
//Keyboard Actions
    public static void keyboardActions(String options) throws AWTException {
		Robot rs = new Robot();
		if (options.equalsIgnoreCase("down")) {
			rs.keyPress(KeyEvent.VK_DOWN);
			rs.keyRelease(KeyEvent.VK_DOWN);
		}
		else if (options.equalsIgnoreCase("up")) {
			rs.keyPress(KeyEvent.VK_UP);
			rs.keyRelease(KeyEvent.VK_UP);
		}
		else if (options.equalsIgnoreCase("enter")) {
			rs.keyPress(KeyEvent.VK_ENTER);
			rs.keyRelease(KeyEvent.VK_ENTER);
		}
	}
//Window Handles
    public static void windowHandles() {
		driver.getWindowHandle();
	}
//Drop down
    public static void DropDown(String option, int index,String selectby,WebElement element ) {
		Select rsr = new Select(element);
		if (option.equalsIgnoreCase("selectbyvalue")) {
			rsr.selectByValue(selectby);
			}
		else if (option.equalsIgnoreCase("selectbyVisibleText")) {
			rsr.selectByVisibleText(selectby);
			}
		else if (option.equalsIgnoreCase("selectbyindex")) {
			rsr.selectByIndex(index);
			}
		else if (option.equalsIgnoreCase("deselectbyValue")) {
			rsr.deselectByValue(selectby);
			}
		else if (option.equalsIgnoreCase("deselectbyVisibleText")) {
	       rsr.deselectByVisibleText(selectby);		
		}
     
		else if (option.equalsIgnoreCase("deselectbyIndex")) {
			rsr.deselectByIndex(index);
		}
		else if (option.equalsIgnoreCase("getAllSelectOption")) {
			List<WebElement> allSelectedOptions = rsr.getAllSelectedOptions();
			for (WebElement allSelectedoptions : allSelectedOptions) {
				String text = allSelectedoptions.getText();
				System.out.println(text);
			}
		}
		else if (option.equalsIgnoreCase("getfirstSelectoption")) {
			 WebElement firstSelectedOption = rsr.getFirstSelectedOption();
			 System.out.println(firstSelectedOption.getText());
			 }
		else if (option.equalsIgnoreCase("getOptions")) {
			List<WebElement> getOPtions = rsr.getOptions();
			for (WebElement all : getOPtions) {
				String text = all.getText();
				System.out.println(text);
			}
		}
		else if (option.equalsIgnoreCase("deselectAll")) {
			rsr.deselectAll();
		}
    }
//Check Box
    public static void CheckBox(WebElement element) {
   	 element.click();
   	 }
//Is enable
    public static void isEnable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("Enabled or not:"+ enabled);
	}
//Is displayed
    public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("Displayed or not:"+ displayed);
	}
//Is selected
    public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("Selected or not:"+ selected);
	}
//Get Title
    public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
//GetCurrentUrl
    public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
//GetText
    public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
//GetAttribute
    public void getAttribute(WebElement element) {
		String attribute = element.getAttribute("values");
		System.out.println(attribute);
	}
//Wait
    public static void waitMethod(int index, TimeUnit value ) {
    	driver.manage().timeouts().implicitlyWait(index, value);
	}
//TakeScreenshot
    public static void takeScreenshot(String pathname) throws IOException {
		TakesScreenshot srj = (TakesScreenshot) driver;
		File src = srj.getScreenshotAs(OutputType.FILE);
		File dest = new File(pathname);
		FileUtils.copyFile(src, dest);
	}
//ScrollUp and Down
    	public static void scrollmethod(WebElement element) {
    		JavascriptExecutor sj =(JavascriptExecutor) driver;
    		sj.executeScript("arguments[0].scrollview();",element);
    }
//sendKeys	
        public static void inputValues(WebElement element, String values) {
   		element.sendKeys(values);
   	}
//Ismultiple
        public static void isMultiple() {
          boolean multiple = srj.isMultiple();
          System.out.println(multiple);
	}
//click
        public static void Click(WebElement element) {
        element.click();
	}
//RadioButton
        public static void radioButton(WebElement element) {
        	element.click();
	}
//Clear
        public static void clear(WebElement element) {
			element.clear();
	}
}
	
	
	
	
	
	
	
	
	

