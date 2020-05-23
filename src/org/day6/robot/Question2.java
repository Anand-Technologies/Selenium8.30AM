package org.day6.robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		
		WebElement click1 = driver.findElement(By.xpath("//a[@title='Google apps']"));
		click1.click();
		
		WebElement gmail = driver.findElement(By.xpath("//span[@pid='23']"));
		gmail.click();
	}

}
