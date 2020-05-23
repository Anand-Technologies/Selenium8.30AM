package org.day4.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question11 {  //----------Question-11------Amazon.in
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone 11 pro max 256gb gold");
		WebElement click = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		click.click();

		driver.get("https://www.amazon.in/Apple-iPhone-Pro-Max-256GB/dp/B07XLS5796/ref=sr_1_3?keywords=iphone+11+pro+max+256gb+gold&qid=1578490568&sr=8-3");
		
		WebElement iphone = driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[4]"));
		iphone.click();
		
		WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		cart.click();
		
				WebElement search1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				search1.sendKeys("apple watch series 5 44mm");
				WebElement click1= driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
				click1.click();
				
				driver.get("https://www.amazon.in/Apple-Watch-GPS-44mm-Aluminium/dp/B07XWYVT98/ref=sr_1_5?keywords=apple+watch+series+5+44mm&qid=1578491073&s=electronics&sr=1-5");
		
				WebElement iwatch = driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[6]"));
				iwatch.click();
				
				WebElement cart1 = driver.findElement(By.id("add-to-cart-button"));
				cart1.click();
				
					WebElement cartvalue = driver.findElement(By.id("hlb-subcart"));
					String value = cartvalue.getText();
					System.out.println(value);
		
	}

}
