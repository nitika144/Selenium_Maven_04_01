package Assignments;



import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class check_box {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//input[@id='monday']")).click();
	}
}


