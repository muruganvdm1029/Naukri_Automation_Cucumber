package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {

	private static FileInputStream fileinputstream;
	private static Properties naukriproperty;
    private static void PropertySetting() throws IOException {
   File file = new File("C:\\Users\\HP\\eclipse-workspace\\Cucumber\\src\\main\\resources\\TestData.properties");
   try {    
	        fileinputstream = new FileInputStream(file);
			naukriproperty = new Properties();
			naukriproperty.load(fileinputstream);
             } catch (FileNotFoundException e) {
			Assert.fail("ERROR:OCCURE DURING FILE LODIANG");
             } catch (Exception e) {
            	 Assert.fail("ERROR:OCCURE DURING FILE LODIANG");
             }
		}

	public static String getDataProperty(String dataValue) throws IOException {
        PropertySetting();
		String property = naukriproperty.getProperty(dataValue);
		return property;
	}
	
      }

