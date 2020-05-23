package org.day5.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement mouse1 = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
	Actions acc = new Actions(driver);
		acc.moveToElement(mouse1).perform();
		
		WebElement mouse2 = driver.findElement(By.xpath("//a[@alt='Home|CT4P2|Mobiles & |NA|Smart Phones|Rs.5001 - Rs.10000|NA|NA|CT@Rs.5001 - Rs.10000']"));
		acc.moveToElement(mouse2).perform();
		mouse2.click();
	}

}
