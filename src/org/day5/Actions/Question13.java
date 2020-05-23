package org.day5.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question13 {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		
		dri.get("https://www.homedepot.com/");
		WebElement mouse1 = dri.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
	Actions acc = new Actions(dri);
		acc.moveToElement(mouse1).perform();
		
		WebElement mouse2 = dri.findElement(By.xpath("(//a[@data-level='Paint'])[1]"));
		acc.moveToElement(mouse2).perform();
	//Thread.sleep(3000);
		WebElement mouse3 = dri.findElement(By.xpath("//a[@title='Interior Paint']"));
		acc.moveToElement(mouse3).perform();
		
		WebElement mouse4 = dri.findElement(By.xpath("//a[@title='Ceiling Paint']"));
		acc.moveToElement(mouse4).perform();
		mouse4.click();

	}
}
