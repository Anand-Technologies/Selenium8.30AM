package org.day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//QUESTION 6
//----------
//URL : https://www.swiggy.com/
//NOTE: Enter the location.
public class Question6 {
	public static void main(String[] args) {
	//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//launch URL	
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
	//Find Locator
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys("kodungaiyur");
	
	}
}
