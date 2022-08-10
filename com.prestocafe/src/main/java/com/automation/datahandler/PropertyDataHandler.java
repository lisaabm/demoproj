package com.automation.datahandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyDataHandler {
	public static final String currentDir  = System.getProperty("user.dir"); 
	public static String filePath = currentDir + "/src/main/resources/";

	public Properties readPropertiesFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties propertydatahandler = null;
	      try {
	         fis = new FileInputStream(filePath+fileName);
	         propertydatahandler = new Properties();
	         propertydatahandler.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      System.out.println("url: "+ propertydatahandler.getProperty("url"));
	      System.out.println("username: "+ propertydatahandler.getProperty("username"));
	      System.out.println("password: "+ propertydatahandler.getProperty("password"));
	      return propertydatahandler;
	   }
}

