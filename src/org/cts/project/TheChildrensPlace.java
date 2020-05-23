package org.cts.project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TheChildrensPlace {

		public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().version("78").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.childrensplace.com/us/home");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@aria-label='Close this modal'])[1]")).click();
	//MouseOver	
		WebElement mouse1 = driver.findElement(By.xpath("//a[@data-title='Toddler Boy']"));
	Actions acc = new Actions(driver);
		acc.moveToElement(mouse1).perform();
	//Select Product 1
		driver.findElement(By.xpath("(//a[@href='/us/c/toddler-boy-jeans'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Stretch Jeans']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
		
		driver.findElement(By.xpath("(//div[@class='input-radio-title'])[4]")).click();
	//Dropdown 1
		WebElement dropDown1 = driver.findElement(By.id("labeled-select_0"));
	Select s1 = new Select(dropDown1);
		s1.selectByVisibleText("5");
		driver.findElement(By.xpath("//button[@class='button-add-to-bag']")).click();
		driver.findElement(By.xpath("//button[@class='continue-shopping']")).click();
	//Select Product 2	
		driver.findElement(By.xpath("(//button[@type='button'])[23]")).click();
		driver.findElement(By.xpath("(//div[@class='input-radio-title'])[2]")).click();
		WebElement dropDown2 = driver.findElement(By.id("labeled-select_1"));
	//Dropdown 2
	Select s2 = new Select(dropDown2);
		s2.selectByVisibleText("10");
		driver.findElement(By.xpath("//button[text()='Add to Bag']")).click();
		//driver.findElement(By.xpath("/us/bag")).click();
	Thread.sleep(3000);
		
	//Take Screenshot
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\GreensTechnology\\Selenium8.30AM\\screenshot\\e-commerce.png");
		FileUtils.copyFile(src, des);
		
	//Using Javascript for getattribute and print that	
	JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement js1 = driver.findElement(By.xpath("(//dt[@class='container-points__label'])[2]"));
		System.out.println(js1.getText());
		
		WebElement js2 = driver.findElement(By.xpath("(//dd[@class='container-points__points'])[2]"));
		System.out.println(js2.getText());
		
		driver.findElement(By.xpath("//button[@class='continue-shopping']")).click();

	//Search --- Boys shoes by JAVASCRIPT
		WebElement element = driver.findElement(By.xpath("//input[@name='typeahead']"));
		element.click();
		js.executeScript("arguments[0].setAttribute('value','Boys Shoes')", element);
		WebElement element2 = driver.findElement(By.xpath("//button[@class='button-search']"));
		element2.sendKeys(Keys.ENTER);
		
		////button[@title='search']
	}
}
