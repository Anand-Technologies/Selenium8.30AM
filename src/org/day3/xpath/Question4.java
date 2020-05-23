package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Anand");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastname']"));
		lastname.sendKeys("Yuvan");
		WebElement gender = driver.findElement(By.xpath("//input[@id='sex-0']"));
		gender.click();
		WebElement exp = driver.findElement(By.xpath("//input[@name='exp'][3]"));
		exp.click();
		
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("12/11/1994");
				
	}
}
