package org.day6.robot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {   //------Question-3
	public static void main (String [] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		//WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Greens technology’s selenium training will upgrade your skills in automation testing ')]"));
		WebElement text = driver.findElement(By.id("article-wrapper"));
			//String text1 = text.getText();
			//System.out.println(text1);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
			Actions acc = new Actions(driver);
			acc.contextClick(text).perform();
		for (int i=1; i<=2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);			
	}
}

