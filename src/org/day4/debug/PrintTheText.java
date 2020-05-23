package org.day4.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheText { 
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); 
		
		WebElement printtext = driver.findElement(By.xpath("//span[text()='Create an account']"));
		String text = printtext.getText();
		System.out.println(text);
		
		//System.out.println(driver.findElement(By.xpath("//span[text()='Create an account']"))).click():
		
		WebElement textcontains = driver.findElement(By.xpath("//span[text()='Create an account']"));
		String text1 = textcontains.getText();
		System.out.println(text1);
		
		
		 
		
	}
}
