package org.day8.AlertsFrames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		//Submit - LOGIN 
			WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
			submit.click();
		//Alert	
			Alert a = driver.switchTo().alert();
			a.accept();
	}
}
