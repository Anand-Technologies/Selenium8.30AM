package org.day4.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAdactinDebug {  //------Question-10
	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://adactin.com/HotelApp/");
		
		WebElement username = d.findElement(By.id("username"));
		username.sendKeys("anand4455");
		
		WebElement pass = d.findElement(By.id("password"));
		pass.sendKeys("anand4455");
		
		WebElement login = d.findElement(By.xpath("//input[@id='login']"));
		login.click();
		
	}
}
