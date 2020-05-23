package org.day7.ScrollScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Question2Ques3 { //ScrollDownUp

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement e1 = driver.findElement(By.id("email"));
			js.executeScript("arguments[0].setAttribute('value','anandtesting45@gmail.com')", e1);
	//ScrollDown
		WebElement e4 = driver.findElement(By.id("u_0_13"));
			js.executeScript("arguments[0].scrollIntoView(true)", e4);
			//e4.click();
	//ScrollUp
		 Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView(false)", e1);			
				
	}

}
