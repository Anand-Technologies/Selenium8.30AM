package org.day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//QUESTION 9
//-----------
//URL : https://www.irctc.co.in/
//NOTE: Just enter the values for the textbox only.

public class Question9 {
	public static void main(String[] args) {
	//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//Launch URL	
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
	//Find Locator
		WebElement txtFrom = driver.findElement(By.xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[1]"));
		txtFrom.sendKeys("Chennai Egmore");
		WebElement click = driver.findElement(By.xpath("//span[@class='ng-star-inserted']"));
		click.click();
		WebElement txtPassword = driver.findElement(By.xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[2]"));
		txtPassword.sendKeys("Devakottai");
	}
}
