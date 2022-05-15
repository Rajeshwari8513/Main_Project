package org.Page_Object_Manager;

import org.Page_Object_Model.Page_1;
import org.Page_Object_Model.Page_2;
import org.Page_Object_Model.Page_3;
import org.Page_Object_Model.Page_4;
import org.Page_Object_Model.Page_5;
import org.openqa.selenium.WebDriver;

public class P_O_M {

     //private datatype variable;
	//private webelement element;
	//private classname object;
	
	public WebDriver driver;
	
	private Page_1 pg_1;
	
	public P_O_M(WebDriver driver2) {
		this.driver = driver2;
	}

	public Page_1 getPg_1() {
		
		if (pg_1==null) {
			
			pg_1 = new Page_1(driver);	
		}
	    return pg_1;
	}

	private Page_2 pg_2;

	public Page_2 getPg_2() {
		
		if (pg_2==null) {
			
			pg_2 = new Page_2(driver);
		}
		return pg_2;
	}

	private Page_3 pg_3;
	
	public Page_3 getPg_3() {
		
		if (pg_3==null) {
		
			pg_3 = new Page_3(driver);
		}
		return pg_3;
	}

	private Page_4 pg_4;
	
	public Page_4 getPg_4() {
		if (pg_4==null) {
		
			pg_4 = new Page_4(driver);
		}
		return pg_4;
	}

	private Page_5 pg_5;
	
	public Page_5 getPg_5() {
		
		if (pg_5==null) {
		
			pg_5 = new Page_5(driver);
		}
		return pg_5;
	}








}
