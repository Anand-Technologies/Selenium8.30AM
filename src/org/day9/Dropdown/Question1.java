package org.day9.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.toolsqa.com/automation-practice-form/");
			
			//Select one dropdown
			WebElement dropDown = driver.findElement(By.id("selenium_commands"));
			Select s = new Select(dropDown);
			//s.selectByVisibleText("WebElement Commands");
			
			//Print all options in selenium commands
			List<WebElement> options = s.getOptions();
			System.out.println("All options in DROPDOWN  :");
				for (WebElement x : options) {
					String name = x.getText();
					System.out.println(name);
				}	
				
			//Select EVEN dropdown's
			s.selectByIndex(0);
			s.selectByIndex(2);
			s.selectByIndex(4);
				
			//Print all the EVEN options in selenium commands
				//getAllSelectedOptions();
		        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			System.out.println("Selected EVEN options in DROPDOWN  :");
			for (int i=0; i<allSelectedOptions.size(); i++ ) {
				String text = allSelectedOptions.get(i).getText();
				System.out.println(text);
			}
	}
}
