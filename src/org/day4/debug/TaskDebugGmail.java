package org.day4.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDebugGmail {  //------Question-9
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver ana = new ChromeDriver();
		ana.manage().window().maximize();
		
		ana.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//WebElement UseAnotherAcc = ana.findElement(By.xpath("(//div[@class='BHzsHc'])[1]"));
		//UseAnotherAcc.click(); 
		
		WebElement mailid = ana.findElement(By.id("identifierId"));
		mailid.sendKeys("anandyuvan994@gmail.com");
		
		WebElement next = ana.findElement(By.id("identifierNext"));
		next.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement pass = ana.findElement(By.name("password"));
		pass.sendKeys("password@12345");
		
		WebElement passnext = ana.findElement(By.id("passwordNext"));
		passnext.click();
		
	}
}
