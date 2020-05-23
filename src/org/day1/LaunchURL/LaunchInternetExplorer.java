package org.day1.LaunchURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchInternetExplorer { 
	
	public static void main(String[] args) {
	//Configure browser
		System.setProperty("webdriver.ie.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\IEDriverServer.exe");		
		WebDriver driver = new InternetExplorerDriver();
		
	//Launch IE Browser to site	
		driver.get("http://www.greenstechnologys.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	//Launch browser to site	
		driver.get("http://demo.automationtesting.in/Register.html");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
	//Launch browser to site	
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
	//Launch browser to site	
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank/online-banking/net-banking");
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
		
	}

}
