package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		WebElement register = driver.findElement(By.xpath("//a[@href='/register']"));
		register.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("anandselenium@mail.com");
	}

}
