package Frameworkutli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsefactory {
	
	
	public static WebDriver fbrowser(WebDriver driver,String browser,String url) {
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:/Users/user/Desktop/geckodriver.exe");
			 driver= new FirefoxDriver();
		
		
		}
		else if(browser.equals("Chrome")) {
			
	}
	
		else if(browser.equals("IE")) {
	
	}
		else {
		System.out.println("No browser support");
		
	}
	driver.get(url);	
	return driver;
	}
	public static void tearDown( WebDriver driver) {
		
		driver.quit();
	
	}
	}

