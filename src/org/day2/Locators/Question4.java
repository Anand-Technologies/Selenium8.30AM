package org.day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//QUESTION 4
//----------
//URL : https://infinity.icicibank.com/corp/Login.jsp
//NOTE: Enter username and password. 

public class Question4 {
	public static void main(String[] args) {
	//Configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	//Launch URL	
		driver.get("https://infinity.icicibank.com/corp/Login.jsp\r\n");
		driver.manage().window().maximize();

	//find locators	
		WebElement txtUserID = driver.findElement(By.id("DUMMY1"));
		txtUserID.sendKeys("9940015190");
		
		WebElement enter = driver.findElement(By.id("user-id-goahead"));
		enter.click();
		
		WebElement txtusername = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtusername.sendKeys("333anand999");
		WebElement txtpassword = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtpassword.sendKeys("anand@4455");
	}

}
