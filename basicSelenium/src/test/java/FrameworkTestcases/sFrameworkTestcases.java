package FrameworkTestcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FrameworkPages.FrameworkPages;
import FrameworkPages.base;
import Frameworkutli.helper;

public class sFrameworkTestcases extends base{
	
	@Test
	public void login() throws Exception {
	logger	=report.createTest("login");
	
	FrameworkPages  Pages=PageFactory.initElements(driver, FrameworkPages.class);	
	logger.info("start application");
		 Pages.orangelogin(d.getCellStringdata(0,0),d.getCellStringdata(0,1));
		 helper.screenshot(driver);
	}
	}
	


