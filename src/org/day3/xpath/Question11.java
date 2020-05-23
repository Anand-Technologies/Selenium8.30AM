package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver ", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Anand");
		driver.findElement(By.id("lastName")).sendKeys("Yuvan");
		driver.findElement(By.xpath("//input[@id='userame']")).sendKeys("yuvananand5");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("password333");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("passowrd999");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}

}
