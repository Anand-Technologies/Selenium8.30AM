package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement signin = driver.findElement(By.xpath("(//span[@class='nav-line-2 '])[1]"));
		signin.click();
		WebElement createacc = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		createacc.click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Anand");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9940015***");
		driver.findElement(By.id("ap_email")).sendKeys("anandselenium@mail.com");
		driver.findElement(By.id("ap_password")).sendKeys("password12345");
		driver.findElement(By.id("continue")).click();
		
	}

}
