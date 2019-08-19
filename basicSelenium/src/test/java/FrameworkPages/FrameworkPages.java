	
	package FrameworkPages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class FrameworkPages {
		WebDriver driver;
		
		public  FrameworkPages(WebDriver driver) {
			this.driver=driver;
		}
		
			@FindBy(name="txtUsername1") WebElement Username;
			@FindBy(name="txtPassword") WebElement Password;
			@FindBy(xpath="//input[@id='btnLogin']") WebElement btnLogin;
			
			
			
			
			public void orangelogin(String uname,String pass) {
				Username.sendKeys(uname);
				Password.sendKeys(pass);
				btnLogin.click();
			
			}
		}





