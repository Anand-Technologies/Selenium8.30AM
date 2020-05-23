package org.day5.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		WebElement category = driver.findElement(By.id("nav-hamburger-menu"));
		category.click();
		
		Actions acc = new Actions(driver);
		WebElement mouse1 = driver.findElement(By.xpath("(//i[@class='nav-sprite hmenu-arrow-next'])[6]"));
		acc.moveToElement(mouse1).perform();
		mouse1.click();
		
		WebElement mouse2 = driver.findElement(By.xpath("//a[@href='/gp/browse.html?node=6612025031&ref_=nav_em_T1_0_4_NaN_5_sbc_mobcomp_powerbank']"));
		acc.moveToElement(mouse2).perform();
		mouse2.click();
		
	}

}
