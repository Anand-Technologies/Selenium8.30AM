package org.day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//QUESTION 1
//----------
//URL : https://www.facebook.com/ 
//NOTE: Enter Email or Phone and Password.

public class Question1 {
	public static void main(String[] args) {
	//configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//Launch URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	//FInd locators
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("anandselenium@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("password123");
	}
}
