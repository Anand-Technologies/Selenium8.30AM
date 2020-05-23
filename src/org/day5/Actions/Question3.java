package org.day5.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		WebElement loginclose = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		loginclose.click();
		
		WebElement mouse1 = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[6]"));
	Actions acc = new Actions(driver);
		acc.moveToElement(mouse1).perform();
		
		WebElement mouse2 = driver.findElement(By.xpath("//a[@title='Dining Tables & Chairs']"));
		acc.moveToElement(mouse2).perform();
		mouse2.click();
		
		Thread.sleep(3000);
		WebElement selecttable = driver.findElement(By.xpath("//a[@title='Flipkart Perfect Homes Langkawi Solid Wood 6 Seater Dining Set']"));
		selecttable.click();
		
		driver.get("https://www.flipkart.com/home-nilkamal-alice-solid-wood-6-seater-dining-set/p/itmf5jbad5ndgzyg?pid=DISF5J4GWJMDHYRW&lid=LSTDISF5J4GWJMDHYRWPQR18K&marketplace=FLIPKART&srno=b_1_11&otracker=nmenu_sub_Home%20%26%20Furniture_0_Dining%20Tables%20%26%20Chairs&fm=organic&iid=df2883b2-5480-4054-a708-0ea5f51359b0.DISF5J4GWJMDHYRW.SEARCH&ppt=browse&ppn=browse&ssid=11yn5sziao0000001578666024123");
		//Thread.sleep(3000);
		WebElement cart = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		cart.click();
		
	}
}
