package org.day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//QUESTION 8
//-----------
//URL : https://www.instagram.com/accounts/login/?hl=en) login page 
//NOTE: Enter username and password. 

public class Question8 {

	public static void main(String[] args) {
	//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//Launch URL	
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page \r\n ");
		driver.manage().window().maximize();
	//Find Locator	
		WebElement txtUsername = driver.findElement(By.name("username"));
		txtUsername.sendKeys("anand4455");
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("password@123");

	}
}
