package Day_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Login {
	//locator
	//test methods
	//validate

	WebDriver driver;//global
	//constructor

	Login(WebDriver driver) 
	{

		this.driver=driver;//chrome,etc
	}

	//locate element
	By logo= By.cssSelector("img[alt='company-branding']");//by return by type of data type
	By user_name=By.name("username");
	By pass_wrd=By.name("password");
	By clickbutton=By.xpath("//button[@type='submit']");

	//action

	public  void setUserName(String username)
	{

		driver.findElement(user_name).sendKeys("Admin");

	}
	public  void setpassWrod(String password)
	{

		driver.findElement(pass_wrd).sendKeys("admin123");

	}
	public  void clickButton()
	{

		driver.findElement(clickbutton).click();

	}
	public  Boolean checklogo(String Logo)
	{

		Boolean status	=driver.findElement(logo).isDisplayed();
		return status;

	}



}
