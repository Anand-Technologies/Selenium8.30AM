package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question15 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='navbar_username']"));
		username.sendKeys("anand333999");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='navbar_password']"));
		password.sendKeys("anand4455");
		
		//WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
		//login.click();

	}
}
