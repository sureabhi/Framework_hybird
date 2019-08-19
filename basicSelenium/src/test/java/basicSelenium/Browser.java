package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browser { 
	WebDriver driver;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.gecko.driver","C:/Users/user/Desktop/geckodriver.exe");
		 driver= new FirefoxDriver();
		
		}
	@Test
	public void testSearch() throws Exception {
	driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=1652915732&extra_1=s%7Cc%7C318269299110%7Ce%7Cfacebook%27%7C&placement=&creative=318269299110&keyword=facebook%27&partner_id=googlesem&extra_2=campaignid%3D1652915732%26adgroupid%3D60884378542%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-362360550869%26loc_physical_ms%3D9071837%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIhPuAx6Ka4wIVjTUrCh2X0AStEAAYASAAEgK2zfD_BwE");	
	String Title=driver.getTitle();
	System.out.println(""+Title);
		Thread.sleep(2000);
		WebElement Day=driver.findElement(By.id("month"));
			Select sel=new Select(Day);
			List<WebElement> ele=sel.getAllSelectedOptions();
	 int count= ele.size();
	 for(WebElement mon :ele) {
		// System.out.println("the count is"+mon.get(count).getText());
	 
	 }
	 //System.out.println("the count is"+ele.size());
	  
		
		
	}
		
		
	
	@AfterTest
public void teardown() {
	driver.close();
}
}
