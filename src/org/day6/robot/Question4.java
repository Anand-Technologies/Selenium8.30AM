package org.day6.robot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question4 {
	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");	
	WebElement select = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(select).perform();
		select.click();	
	driver.get("http://greenstech.in/interview-questions/cts.pdf#toolbar=0"); 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_C);
				r.keyRelease(KeyEvent.VK_C);
				r.keyRelease(KeyEvent.VK_CONTROL);
					r.keyPress(KeyEvent.VK_CONTROL);
					r.keyPress(KeyEvent.VK_V);
					r.keyRelease(KeyEvent.VK_V);
					r.keyRelease(KeyEvent.VK_CONTROL);
	}
}
