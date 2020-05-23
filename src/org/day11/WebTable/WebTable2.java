package org.day11.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		
		 List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		for (int i=0; i< tRow.size(); i++) {
			WebElement tr = tRow.get(i);
			
			List<WebElement> thead = tr.findElements(By.tagName("td"));
			for(int j=0; j< thead.size(); j++) {
			WebElement th = thead.get(j);
			
			String text = th.getText();
			System.out.println(text);
		}
	}

}
	}
