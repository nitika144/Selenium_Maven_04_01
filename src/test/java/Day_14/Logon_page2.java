package Day_14;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logon_page2 {
	
		WebDriver driver;//global
		//constructor

		 Logon_page2(WebDriver driver) 
		{

			this.driver=driver;//chrome,etc
			PageFactory.initElements(driver,this);
			
		}

		//locate element
		@FindBy(css="img[alt='company-branding']")
		WebElement logo;
		@FindBy(name="username")
		WebElement user_name;
		@FindBy (name="password")
		WebElement pass_wrd;
		@FindBy (xpath = "//button[@type='submit']")
		WebElement clickButton;

		//actions

		public  void setUserName(String username)
		{

			user_name.sendKeys("Admin");

		}
		public  void setpassWrod(String password)
		{

			pass_wrd.sendKeys("admin123");

		}
		public  void clicksubmit()
		{

			clickButton.click();

		}
		public  Boolean checklogo()
		{

			Boolean status	=logo.isDisplayed();
			return status;

		}



}