package org.day4.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement text1 = driver.findElement(By.xpath("//span[text()='Electronics']"));
		String  print1 = text1.getText();
		System.out.println(print1);
		
		WebElement text2 = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		String  print2 = text2.getText();
		System.out.println(print2);
		
		WebElement text3 = driver.findElement(By.xpath("//span[text()='Men']"));
		String  print3 = text3.getText();
		System.out.println(print3);
		
		WebElement text4 = driver.findElement(By.xpath("//span[text()='Women']"));
		String  print4 = text4.getText();
		System.out.println(print4);
		
		WebElement text5 = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		String  print5 = text5.getText();
		System.out.println(print5);
		
		WebElement text6 = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		String  print6 = text6.getText();
		System.out.println(print6);
		
		WebElement text7 = driver.findElement(By.xpath("//span[text()='Sports, Books & More']"));
		String  print7 = text7.getText();
		System.out.println(print7);
		
					try {
					WebElement text8 = driver.findElement(By.xpath("//span[text()='Grocery']"));
					String  print8 = text8.getText();
					System.out.println(print8); }
					catch(Exception e) {
						System.out.println("Element not found");
					}
		
		WebElement text9 = driver.findElement(By.xpath("//span[text()='Offer Zone']"));
		String  print9 = text9.getText();
		System.out.println(print9);		
	}
}
