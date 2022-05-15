package org.Property_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
        File f = new File("C:\\Users\\admin\\eclipse-workspace\\New_Project\\src\\main\\java\\org\\Property_File\\Adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	}

	public String url() throws Throwable {

		String url = p.getProperty("url");

		return url;
	}

	public String username() throws Throwable {

		String username = p.getProperty("username");

		return username;
	}

	public String password() throws Throwable {

		String password = p.getProperty("password");

		return password;
	}

	public String datepick_in() throws Throwable {

		String datepick_in = p.getProperty("datepick_in");

		return datepick_in;
	}

	public String datepick_out() throws Throwable {

		String datepick_out = p.getProperty("datepick_out");

		return datepick_out;
	}

	public String firstname() throws Throwable {

		String firstname = p.getProperty("firstname");

		return firstname;
	}

	public String lastname() throws Throwable {

		String lastname = p.getProperty("lastname");

		return lastname;
	}

	public String address() throws Throwable {

		String address = p.getProperty("address");

		return address;
	}

	public String cc_num() throws Throwable {

		String cc_num = p.getProperty("cc_num");

		return cc_num;
	}

	public String cc_cvv() throws Throwable {

		String cc_cvv = p.getProperty("cc_cvv");

		return cc_cvv;
	}
}

