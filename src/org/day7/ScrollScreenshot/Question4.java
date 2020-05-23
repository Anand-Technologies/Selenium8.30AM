package org.day7.ScrollScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/index.html");
		
		//Scroll DOWN
		WebElement down = driver.findElement(By.xpath("//span[text()='Greens Technologys Overall Reviews']"));
	JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView(true)" , down);
		
		//Take ScreenShot
	TakesScreenshot tk = (TakesScreenshot) driver ;
		File src = tk.getScreenshotAs(OutputType.FILE);  // or File src = ((TakeScreenshot)driver).getScreenShotAs(OutputType.FILE); 
		//File des = new File("C:\\GreensTechnology\\Selenium8.30AM\\screenshot\\Greens.png");
		FileUtils.copyFile(src, new File("C:\\GreensTechnology\\Selenium8.30AM\\screenshot\\Greens.png"));
	}
}

