package org.day1.LaunchURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfirefox {
	public static void main(String[] args) {
	//Configure browser 
		System.setProperty("webdriver.gecko.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	//launch URL	
		driver.get("http://www.greenstechnologys.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	//Launch URL1	
		driver.get("https://www.facebook.com/");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
	//launch URL2	
		driver.get("https://www.amazon.in/");
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
	//Launch URL3
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);		
		
	}

}
