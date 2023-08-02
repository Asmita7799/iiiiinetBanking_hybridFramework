package com.iiiiinetbanking.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties prop;

	public ConfigDataProvider(String configFileName) {

		try {

			File fs = new File("./Config/" + configFileName + ".properties");
			FileInputStream fins = new FileInputStream(fs);
			prop = new Properties();
			prop.load(fins);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String searchKey(String keyname) {
		return prop.getProperty(keyname);
	}

	public String getUserName() {
		return prop.getProperty("Username");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}

	public String getAppURL() {
		return prop.getProperty("appURL");
	}

	/*
	 * public static void main(String[] args) { ConfigDataProvider config = new
	 * ConfigDataProvider("config"); String appURL =
	 * config.prop.getProperty("appURL"); System.out.println(appURL);
	 * 
	 * System.out.println(config.prop.getProperty("Username"));
	 * System.out.println(config.prop.getProperty("Password")); }
	 */

}
