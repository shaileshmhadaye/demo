package com.example.demo;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	static Logger log = Logger.getLogger(PropertyReader.class.getName());
	public static String getUrlString(String url) {
		String finalURL = null;
		try {
			Properties prop = new Properties();
			InputStream inputStream = PropertyReader.class.getClassLoader().getResourceAsStream("application.properties");
			prop.load(inputStream);
			finalURL = prop.getProperty(url);

		} catch (IOException e) {
			log.error("Exception in PropertyReader :: "+e);
			e.printStackTrace();
		}

		return finalURL;
	}
}
