package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//QUESTION 2
//-----------
//URL : https://www.facebook.com/
//NOTE: Enter email and password and click login(by using xpath locator).

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("99400151**");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("password@123");
		WebElement login = driver.findElement(By.xpath("//input[@id='u_0_4']"));
		login.click();
		
	}
}
