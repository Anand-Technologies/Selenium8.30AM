package org.day6.robot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question7 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver" , "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement select1 = driver.findElement(By.xpath("//span[@id='Wrapper_Classes']"));
	Actions acc = new Actions(driver);
		acc.doubleClick(select1).perform();
	Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
			for(int i=0; i<13; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
		r.keyRelease(KeyEvent.VK_SHIFT);		
	acc.contextClick().perform();
			for (int i=0; i < 2; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN); 
			}
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
	}
}
