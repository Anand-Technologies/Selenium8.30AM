package org.day8.AlertsFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {  
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
		driver.switchTo().frame("login_page");
		WebElement userId = driver.findElement(By.name("fldLoginUserId"));
		userId.sendKeys("333666");
		
		WebElement conti = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		conti.click();
		
		
		WebElement pass = driver.findElement(By.xpath("(//span[@class='pwd_field'])[2]"));
		pass.sendKeys("4455");
		
	}

}
