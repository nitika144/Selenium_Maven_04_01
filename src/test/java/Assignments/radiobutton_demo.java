package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton_demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		// Checkbox
		WebElement checkbox = driver.findElement(By.id("sunday"));
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
		// Radio Button
		WebElement radioButton = driver.findElement(By.id("male"));
		if (!radioButton.isSelected()) {
			radioButton.click();
		}


	}
}

