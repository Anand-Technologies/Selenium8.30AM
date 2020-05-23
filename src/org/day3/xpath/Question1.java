package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//QUESTION 1
//-----------
//URL : http://www.greenstechnologys.com/
//NOTE: Click Contact us. Give the details for submit your enquiry form.

public class Question1 {
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("//a[@href='contact.php']"));
		btn.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='InputName']"));
		name.sendKeys("Anand");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("anandselenium@gmail.com");
		WebElement phn = driver.findElement(By.xpath("//input[@name='phone']"));
		phn.sendKeys("99400151***");
		WebElement course = driver.findElement(By.xpath("//option[@value='Software Testing']"));
		course.click();
		WebElement branch = driver.findElement(By.xpath("//option[@value='OMR']"));
		branch.click();
		WebElement start = driver.findElement(By.xpath("//option[@value='Immediately']"));
		start.click();
		WebElement txt = driver.findElement(By.xpath("//textarea[@name='comments']"));
		txt.sendKeys("Very much excited to join  Greens Technology");
		//WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
		//button.click();
		
		//driver.quit();
	}

}
