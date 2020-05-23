package org.day5.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement mouse1 = driver.findElement(By.xpath("//a[text()='Sports & More']"));
	Actions acc = new Actions(driver);
		acc.moveToElement(mouse1).perform();
		
		WebElement mouse2 = driver.findElement(By.xpath("//a[@alt='Home|CT4P2|Sports & M|NA|Diet Nutrition|Weight Gainers|NA|NA|CT@Weight Gainers']"));
		acc.moveToElement(mouse2).perform();
		mouse2.click();
		
	driver.get("https://www.shopclues.com/weight-gainers.html?sort_by=bestsellers&sort_order=desc");
	Thread.sleep(3000);
		WebElement prod = driver.findElement(By.xpath("(//span[text()='Medisys Max Mass Gainer 3Kg-Chocolate Free Shaker'])[1]"));
		prod.click();
		
		WebElement addcart = driver.findElement(By.id("add_cart"));
		addcart.click();
		
		WebElement cart1 = driver.findElement(By.xpath("//a[@href='https://secure.shopclues.com/atom/acart/getcart']"));
		cart1.click();
		
		WebElement text = driver.findElement(By.xpath("(//span[text()='Rs 2669'])[3]"));
		String text1 = text.getText();
		System.out.println(text1);
	}

}
