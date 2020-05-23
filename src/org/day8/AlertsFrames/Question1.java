package org.day8.AlertsFrames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//Simple
		WebElement click1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		click1.click();
			Alert a = driver.switchTo().alert();
			a.accept();
		//Confirm Alert
		WebElement confirmAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirmAlert.click();
			driver.findElement(By.id("CancelTab")).click();
			a.dismiss();
		//Prompt Alert
		WebElement promptAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		promptAlert.click();
			driver.findElement(By.id("Textbox")).click();
			a.sendKeys("anand");
			a.accept();	
	}

}
