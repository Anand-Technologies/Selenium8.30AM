package org.day7.ScrollScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysJavascript {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//TypeCasting
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		//SendKeys by using JAVASCRIPT
			WebElement e1 = driver.findElement(By.id("email"));
				js.executeScript("arguments[0].setAttribute('value','anandtesting45@gmail.com')",e1);
			WebElement e2 = driver.findElement(By.id("pass"));
				js.executeScript("arguments[0].setAttribute('value','123456789')", e2);
			WebElement e3 = driver.findElement(By.id("u_0_b"));
				js.executeScript("arguments[0].click", e3);
				
		
	}
}
