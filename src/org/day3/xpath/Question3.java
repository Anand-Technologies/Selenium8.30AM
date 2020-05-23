package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.xpath(" //input[@placeholder='First Name']"));
		firstname.sendKeys("Anand");
		WebElement lastname = driver.findElement(By.xpath(" //input[@placeholder='Last Name']"));
		lastname.sendKeys("Yuvan");
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtaddress.sendKeys("No.99, Jawahar St, Kodungaiyur");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("anandselenium@mail.com");
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9940015***");
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio']"));
		gender.click();
		WebElement hobbies = driver.findElement(By.xpath("//input[@type='checkbox']"));
		hobbies.click();
		WebElement lang = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
		lang.click();
		WebElement skills = driver.findElement(By.xpath("//option[@value='Java']"));
		skills.click();
				
	}
}
