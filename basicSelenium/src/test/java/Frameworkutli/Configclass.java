package Frameworkutli;

import java.io.FileInputStream;
import java.util.Properties;

public class Configclass {
	Properties pro;
	
	public Configclass() throws Exception {
	
	FileInputStream file=new FileInputStream("D:\\basicSelenium\\config\\config.properties");
	pro=new Properties();
	pro.load(file);
	
	}
	
	public String Serachkey(String key) {
		pro.getProperty(key);
	return key;	
	}
	//To get the browser from the config file
	public String getbrow(){
		return pro.getProperty("browser");
	}
	// To get the url from the config file
	public String url(){
		return pro.getProperty("url");
		
		
	}
	}
	
	
	
	


