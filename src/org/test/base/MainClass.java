package org.test.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MainClass extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		launchBrowser();
		launchUrl("https://www.ubuy.co.in/");
		try {
			driver.findElement(By.xpath("//*[@name='v1-name']")).sendKeys("anandtesting@4455");
			driver.findElement(By.xpath("//*[@name='v1-email']")).sendKeys("anand@12345");
			driver.findElement(By.xpath("//*[@id='v1-male']")).click();
			driver.findElement(By.xpath("//*[@id='v1-btn-newsletter']")).click();
		} catch (Exception e) {
			System.out.println("Exception Handled 1");
		}
		try {
			driver.findElement(By.xpath("//*[@name='v2-name']")).sendKeys("anandtesting@4455");
			driver.findElement(By.xpath("//*[@name='v2-email']")).sendKeys("anand@12345");
			driver.findElement(By.xpath("//*[@id='v2-male']")).click();
			driver.findElement(By.xpath("//*[@id='v2-btn-newsletter']")).click();
		} catch (Exception e) {
			System.out.println("Exception Handled 2");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@name='q'])[2]")).click();
		//driver.findElement(By.xpath("(//*[@name='q'])[2]")).sendKeys("iphone 11");

	}
}
