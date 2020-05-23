package org.day5.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Question7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement mouse1 = driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions acc = new Actions(driver);
		acc.moveToElement(mouse1).perform();
		
		WebElement mouse2 = driver.findElement(By.xpath("//a[@href='http://www.greenstechnologys.com/software-testing.html']"));
		acc.moveToElement(mouse2).perform();
		
		WebElement mouse3 = driver.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/selenium-course-content.html'])[1]"));
		acc.moveToElement(mouse3).perform();
		mouse3.click();
		
		
		
		
		
	}

}
