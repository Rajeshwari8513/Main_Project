package org.Property_File;

public class File_Reader {
	
	private File_Reader() {
	
	}
	
	public static File_Reader get_fr() {
		
		File_Reader fr = new File_Reader();
		
		return fr;
	}
	
	public Configuration_Reader get_cr() throws Throwable {
		
		Configuration_Reader cr = new Configuration_Reader();
		
		return cr;
	}	
}
	










