package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class lpress_demo {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://182.76.176.205/btes/");//url open
	driver.findElement(By.name("username")).sendKeys("Admin");//add username
	driver.findElement(By.name("passwd")).sendKeys("admin");//add password
	driver.findElement(By.name("remember")).click();//To check the  functionality of remember me checkbox
	driver.findElement(By.className("button")).click();//To check the functionality of login button
	driver.findElement(By.linkText("New User")).click();//To check the functionality of New user button
	driver.findElement(By.name("newuser_name")).sendKeys("herry");//add valid name 
	
	
	
}
}
