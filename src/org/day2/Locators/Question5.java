package org.day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//QUESTION 5
//----------
//URL : https://netbanking.hdfcbank.com/ 
//NOTE: Enter customer id .

public class Question5 {
	public static void main(String[] args) {
	//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//Launch URl
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
	//Find Locator
		WebElement txtUsername = driver.findElement(By.xpath("//input[@class='input_password']"));
		txtUsername.sendKeys("333666999");
		
		driver.quit();
	}
	
}
