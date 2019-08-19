package questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {
	WebDriver driver;

	public static void main(String[] args) {
		//implicitlyWait
		
	}
public void waitimpl() {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	//implicitWait
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	//explicitWait
	WebDriverWait w=new WebDriverWait(driver, 60);
	w.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
	
}
public void mousemove() {
	driver=new FirefoxDriver();
	Actions a =new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("")));
	a.build().perform();
	
	Actions a1=new Actions(driver);
	WebElement source=driver.findElement(By.name(""));
	WebElement target=driver.findElement(By.xpath(""));  
	a1.dragAndDrop(source,target);
			
	a1.moveToElement(target);
	a1.keyDown(Keys.HOME);
	a1.moveToElement(source);
	a1.release();
}
public void window() {
	
	
	
driver.switchTo().parentFrame();

}
	 
	
	
	
}
	
	
	
	
	
	
	



