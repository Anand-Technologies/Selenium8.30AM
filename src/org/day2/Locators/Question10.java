package org.day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//QUESTION 10
//-----------
//URL : www.adactin.com/HotelApp/
//NOTE: Enter Email or Phone and Password.

public class Question10 {
	public static void main(String[] args) {
	//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//Launch URL	
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
	//Find Locator	
		WebElement txtUsername  = driver.findElement(By.id("username"));
		txtUsername.sendKeys("anand4455");
		WebElement txtPassword  = driver.findElement(By.id("password"));
		txtPassword.sendKeys("anand445566");
		
	}
}
