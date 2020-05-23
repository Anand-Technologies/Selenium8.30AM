package org.day4.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstechnologys.com/index.html");
		WebElement addrtitle= driver.findElement(By.xpath("//span[text()='Greens Technology OMR']"));
		String addr1 = addrtitle.getText();
		System.out.println(addr1);
		
		WebElement addrSecLine = driver.findElement(By.xpath("//strong[contains(text(),'Plot No.19,')]"));
		String addr2 = addrSecLine.getText();
		System.out.println(addr2);
		
		WebElement addrThirdLine = driver.findElement(By.xpath("//strong[contains(text(),'Kancheepuram District')]"));
		String addr3 = addrThirdLine.getText();
		System.out.println(addr3);
		
		WebElement addrFourthLine = driver.findElement(By.xpath("//strong[contains(text(),'Landmark: oppt')]"));
		String addr4 = addrFourthLine.getText();
		System.out.println(addr4);
		
		WebElement addrFifthLine = driver.findElement(By.xpath("//strong[contains(text(),'Thoraipakkam, ')]"));
		String addr5 = addrFifthLine.getText();
		System.out.println(addr5);
	}

}
