package Frameworkutli;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public   class helper {
	
	public static  String screen="D:\\basicSelenium\\screenshot\\abc.png";
	
	public  static String screenshot(WebDriver driver) throws Exception {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileHandler.copy(src, new File(screen));
  return screen;
	}

}
