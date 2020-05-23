package org.day11.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		//For print values in th (thead ----> tr ----> th)
		 WebElement thead = driver.findElement(By.tagName("thead"));
		
		List<WebElement> tableRows = thead.findElements(By.tagName("tr"));
			for(int j=0; j < tableRows.size(); j++ ) {
				WebElement tr = tableRows.get(j); 
				
			List<WebElement> tableData = tr.findElements(By.tagName("th"));
				for(int k =0; k < tableData.size(); k++) {
					WebElement th = tableData.get(k); 
					String text = th.getText();
					System.out.println(text);  }
				
				}
			}				
	} 



