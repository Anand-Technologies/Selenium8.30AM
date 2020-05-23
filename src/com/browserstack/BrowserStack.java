package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BrowserStack {

	public static final String USERNAME = "anands8";
	public static final String AUTOMATE_KEY = "WzotzLzWBsjxegJqdD3x";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "iPhone");
		caps.setCapability("device", "iPhone XS");
		caps.setCapability("realMobile", "true");
		caps.setCapability("os_version", "13");
		caps.setCapability("name", "Iphone xs testing");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("anandtesting45");
		
		driver.findElement(By.id("pass")).sendKeys("1234567");

		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
}
