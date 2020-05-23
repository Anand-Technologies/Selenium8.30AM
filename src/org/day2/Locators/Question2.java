package org.day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//QUESTION 2
//----------
//URL : https://www.redbus.in/ 
//NOTE: Enter from and to textbox.

public class Question2 {
	public static void main(String[] args) {
	//Configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver anand = new ChromeDriver();
	//Launch URL
		anand.get("https://www.redbus.in/?gclid=EAIaIQobChMIoNmEnp3f5gIVBQ4rCh3fwAGeEAAYASAAEgL8N_D_BwE");
		anand.manage().window().maximize();
	//Find locators
		WebElement txtUsername = anand.findElement(By.id("src"));
		txtUsername.sendKeys("chennai");
		
		WebElement txtPassword = anand.findElement(By.id("dest"));
		txtPassword.sendKeys("pudukottai");
	}
}
