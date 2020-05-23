package org.day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//QUESTION 3
//----------
//URL : https://www.google.com/
//NOTE: Enter GreensTechnology.

public class Question3 {
	public static void main(String[] args) {
	//Configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	//Launch URL
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	//Find locators
		WebElement txtName = driver.findElement(By.name("q"));
		txtName.sendKeys("greens technology");
		txtName.click();
		
		WebElement search = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
		search.click();
		
	}
}
