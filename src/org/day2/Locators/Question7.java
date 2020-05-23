package org.day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//QUESTION 7
//----------
//URL :https://www.snapdeal.com/login
//NOTE: Enter mobile number/email.

public class Question7 {
	public static void main(String[] args) {
	//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//Launch URL	
		driver.get("https://www.snapdeal.com/login\r\n");
		driver.manage().window().maximize();
	//Find locator
		WebElement txtMobnum = driver.findElement(By.id("userName"));
		txtMobnum.sendKeys("9940015190");
		
	}
}
