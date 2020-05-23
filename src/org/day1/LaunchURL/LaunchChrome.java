package org.day1.LaunchURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		
// Task-1 :Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		//Launch Chromedriver to GreensTechnology
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.greenstechnologys.com/");
		//Get Current URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//Get Title
		String ti = driver.getTitle();
		System.out.println(ti);
		
//Task-2 : Launch browser to Gmail		
		driver.get("https://accounts.google.com/servicelogin/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//Get Current URL
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
//Task-3 : Launch Browser to Flipkart
		driver.get("https://www.flipkart.com/");
		//Get Current URL
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
//Task-4 : Launch Browser to GrrensTech Course content
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		//Get Current URL
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
	}
}
