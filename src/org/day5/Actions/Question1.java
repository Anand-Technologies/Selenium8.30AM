package org.day5.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {  //-----Drag and Drop
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest = driver.findElement(By.id("bank"));
		Actions acc = new Actions(driver);
		acc.dragAndDrop(src, dest).perform();
		
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest1 = driver.findElement(By.id("amt7"));
		acc.dragAndDrop(src1, dest1).perform();
		
		WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dest2 = driver.findElement(By.id("loan"));
		acc.dragAndDrop(src2, dest2).perform();
		
		WebElement src3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest3 = driver.findElement(By.id("amt8"));
		acc.dragAndDrop(src3, dest3).perform();			
	}
}
