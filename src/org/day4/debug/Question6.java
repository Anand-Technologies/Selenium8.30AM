package org.day4.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		 WebElement username = driver.findElement(By.id("email"));
		 username.sendKeys("anand4455");
		String attribute = username.getAttribute("value");
		System.out.println(attribute);
		
		WebElement password = driver.findElement(By.id("pass"));
		 password.sendKeys("anand333");
		String attribute1 = password.getAttribute("value");
		System.out.println(attribute1);
		
	}

}
