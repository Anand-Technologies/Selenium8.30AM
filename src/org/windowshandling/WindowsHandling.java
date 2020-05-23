package org.windowshandling;

import java.util.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(ch);

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='LM6RPg']")).sendKeys("iphone 11" + Keys.ENTER);
		driver.findElement(By.xpath("//*[text()='Apple iPhone 11 (Black, 128 GB)']")).click();

		String parId = driver.getWindowHandle();
		System.out.println("Parent Id :" + parId);

//		Set<String> allId = driver.getWindowHandles();
//		System.out.println("all Id :" + allId);
//		for (String x : allId) {
//			System.out.println(x);
//			if (!(parId.equals(x))) {
//				driver.switchTo().window(x);
//			}
			

			Set<String> windowHandles = driver.getWindowHandles();
			List<String> li = new LinkedList<>();
			li.addAll(windowHandles);
			driver.switchTo().window(li.get(1));
			driver.findElement(By.xpath("//*[text()='Apple iPhone 11 (Black, 128 GB)']"))
			.click();
		}

	}

