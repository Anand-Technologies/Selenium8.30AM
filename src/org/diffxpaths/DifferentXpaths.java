package org.diffxpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentXpaths {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		// Without Attribute, only TAG NAME alones[Preceding-sibling]:
		driver.findElement(By.xpath("(//span//preceding-sibling::input)[1]")).sendKeys("anandtesting");
		// Parent to Child------child
		driver.findElement(By.xpath("(//td//child::input)[2]")).sendKeys("2345678");
		// Sub-parent to super-parent of child
		driver.findElement(By.xpath("(//tr//preceding-sibling::td//input)[3]")).click();
		// Text---contains---without tag name
		driver.findElement(By.xpath("//*[contains(text(),'New User Regi')]")).click();
		// attribute---contains---with tag name
		driver.findElement(By.xpath("(//input[contains(@id,'usern')])[1]")).sendKeys("anandtesting");
		// AND operator---without TAG NAME
		driver.findElement(By.xpath("//*[@name='password' and @class='reg_input']")).sendKeys("4455999");
		//OR Operator---with TAG NAME
		driver.findElement(By.xpath("//input[@name='re_password' or @class='reg_in']")).sendKeys("445599");
		//attribute---Starts-with
		driver.findElement(By.xpath("//input[starts-with(@name,'userna')]")).sendKeys("Anand Testing");
		
	}
}
