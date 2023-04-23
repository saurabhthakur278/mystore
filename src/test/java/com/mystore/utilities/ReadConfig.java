package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties properties;
	
	String path = "C:\\Users\\saurabh_thakur\\eclipse-workspace\\MyStore\\configuration\\config.properties";
	
	
	public ReadConfig()
	{
		try {
		properties = new Properties();
		
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);;
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		}
	public String getbaseUrl()
	{
		String valur=properties.getProperty("baseUrl");
		if(valur!=null)
			return valur;
		else
			throw new RuntimeException("url is not found");
		
	}
	
	
	public String getbrowser()
	{
		String valur=properties.getProperty("browser");
		if(valur!=null)
			return valur;
		else
			throw new RuntimeException("browser is not found");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
