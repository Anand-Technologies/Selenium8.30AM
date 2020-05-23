package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question12 {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[2]")).click();
		Thread.sleep(4000);
		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		username.sendKeys("Anandyuvan");
		driver.findElement(By.xpath("//input[@id='usrPwd']")).sendKeys("password333");
		driver.findElement(By.xpath("//input[@id='cnfUsrPwd']")).sendKeys("password333");
		WebElement sequrityqns = driver.findElement(By.xpath("(//span[@class='ng-tns-c13-15 ng-star-inserted'])[1]"));
		sequrityqns.click();
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("Blacky");
		
		
		
	}
}
