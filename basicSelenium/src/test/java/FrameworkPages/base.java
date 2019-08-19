package FrameworkPages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Frameworkutli.Configclass;
import Frameworkutli.Testdata;
import Frameworkutli.browsefactory;
import Frameworkutli.helper;

public class base {
	public WebDriver driver;
	public Configclass conf;
	public Testdata d;
	public ExtentReports report; 
	public ExtentTest logger;
	
	
	
	@BeforeSuite
	public void beforesetup() throws Exception {
		
		 d=new Testdata();
		 conf=new Configclass();
		ExtentHtmlReporter rep=new ExtentHtmlReporter("D:\\basicSelenium\\Report\\r.html");
		report=new ExtentReports();
		report.attachReporter(rep);
	}
	
	
	@BeforeTest
	public void setup() {
		driver=browsefactory.fbrowser(driver,conf.getbrow(),conf.url());
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
  @AfterMethod
public void tearDownmethod(ITestResult result) throws Exception {
	if(result.getStatus()==ITestResult.SUCCESS) {
		logger.pass("test passed",MediaEntityBuilder.createScreenCaptureFromPath(helper.screenshot(driver)).build());
		
	}
	else if(result.getStatus()==ITestResult.FAILURE){
		logger.fail("test failed",MediaEntityBuilder.createScreenCaptureFromPath(helper.screenshot(driver)).build());
			
	}
	
	report.flush();
  }
}





