package utli;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Callingclass {
	WebDriver driver=null;
	
@BeforeTest	
public void btest() {
	
		System.setProperty("webdriver.gecko.driver","C:/Users/user/Desktop/geckodriver.exe");
		 driver= new FirefoxDriver();
		
		
}
 
	
@Test(dataProvider = "test")	
	public void TestngCalling(String username,String password ) throws Exception {
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.name("txtUsername")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	Thread.sleep(2000);
	}
	
@DataProvider(name="test")	
public Object[][] pdata() throws Exception{
	
	
	Object[][] text	= Ptest();
	
	return text;
}
	
	



public   Object[][] Ptest() throws Exception {
	excelutli excel= new excelutli("D:/basicSelenium/excel/Book1.xlsx","sheet1");	
	// Get the data into an object array
	
	int size= excel.getRowcount();
	int sizenum=excel.getColcount();
	
	Object d[][] =new Object[size-1][sizenum];
	
	for(int i=1;i<size;i++){
	for(int j=0;j<sizenum;j++){
	
	String Value=excel.getCellStringdata(i,j);
      d[i-1][j]=Value;
	System.out.print("the text is   "+ d[i-1][j]);
}
	System.out.println("");
	}
	return d;
}

}




