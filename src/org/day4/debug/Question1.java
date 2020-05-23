package org.day4.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
driver.get("http://www.greenstechnologys.com/");  //------- // Question-1:
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
		String printtext = text.getText();
		System.out.println("Print last line :"+printtext);
		
driver.get("http://www.greenstechnologies.in/selenium-training.php");  //------Question-2
		
		WebElement printpara = driver.findElement(By.xpath("//li[contains(text(),'Finding out the test elements')]"));
		String paratext = printpara.getText();
		System.out.println("print 3rd Para :"+paratext);
		
		//------Question-3
			//Print 1st paragraph
		WebElement printfirstpara = driver.findElement(By.xpath("//li[contains(text(),'Learning the Selenium')]"));
		String text1 = printfirstpara.getText();
		System.out.println("Print 1st Paragraph :"+text1);
			//print 2nd paragraph
		WebElement printsecondpara = driver.findElement(By.xpath("//li[contains(text(),'Recording and playing')]"));
		String text2 = printsecondpara.getText();
		System.out.println("Print 2nd Paragraph :"+text2);
	}
}
