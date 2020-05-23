package org.day7.ScrollScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Question5 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement scrollDown = driver.findElement(By.xpath("//p[text()='Job Openings']"));
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		TakesScreenshot tk = (TakesScreenshot) driver;
			File src = tk.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\GreensTechnology\\Selenium8.30AM\\screenshot\\Greens1Day5.png");
			FileUtils.copyFile(src, des);		
	}
}
