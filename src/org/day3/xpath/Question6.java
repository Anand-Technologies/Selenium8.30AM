package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
		signin.click();
		WebElement signinclick = driver.findElement(By.xpath("//li[@id='signInLink']"));
		signinclick.click();
		WebElement google = driver.findElement(By.xpath("//div[@class='google-text']"));
		google.click();
	}

}
