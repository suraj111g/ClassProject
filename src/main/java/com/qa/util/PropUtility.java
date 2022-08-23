package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtility {
	/*
	 * @author Kale Jana
	 */
	public static Properties prop = new Properties();
	public static FileInputStream fis=null;
	public static String getValue(String filePath, String key) {
		try {			
			 fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
	public static String getEnvDetails(String key) {
		return getValue("./src/main/resources/com/qa/config/config.properties", key);
	}
	
}