
package org.day8.AlertsFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {   //------------Not Completed
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); //IMPLICIT WAIT
		driver.get("https://paytm.com/");
			
Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
	//Switch To FRAME
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
		driver.switchTo().frame(frame);
Thread.sleep(3000);
	//Click Login/Signup button
		driver.findElement(By.xpath("//span[@user-actions='login_clicked']")).click();
	//
		driver.findElement(By.id("input_0")).sendKeys("anandtesting45@gmail.com");
		driver.findElement(By.id("input_1")).sendKeys("333666999");
				
	}
}
