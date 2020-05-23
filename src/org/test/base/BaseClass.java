package org.test.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static WebDriver driver;

	// Launch Browser
	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\Selenium8.30AM\\Driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver = new ChromeDriver(co);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		WebDriverWait w = new WebDriverWait(driver, 100);
		WebElement element = w.until(ExpectedCondition.alertIsPresent(By.xpath("   ")));
		element.click();

		FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class);
		
		WebElement ele = wait.until(ExpectedCondition.elementToBeclickable(By.id("  "));
		ele.click();
	}

	// Launch URL
	public static void launchUrl(String value) {
		driver.get(value);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	// Pass Sendkeys
	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
	}
	// Click the element

	public static void click(WebElement e) {
		e.click();
	}

	public static void quit() {
		driver.quit();
	}

	// Get title
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// Get Current Url
	public static void getCurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// Dropdown--- Select By Index
	public static void Sbi(WebElement e, int i) {
		Select s = new Select(e);
		s.selectByIndex(i);
	}

	// Dropdown---Select by value
	public static void Sbv(WebElement e, String i) {
		Select s = new Select(e);
		s.selectByValue(i);
	}

	// Dropdown--- Select by Visible Text
	public static void Sbvt(WebElement e, String i) {
		Select s = new Select(e);
		s.selectByVisibleText(i);
	}

	// Alert---Accept
	public static void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	// Alert---Dismiss
	public static void alertDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	// Alert---Sendkeys&accept
	public static void alertSendkeys(String value) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
		a.accept();
	}

	// Take Screenshot
	public static void Takesscreenshot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\GreensTechnology\\Selenium8.30AM\\screenshot\\" + name + ".png");
		FileUtils.copyFile(src, des);
	}

	// Actions---move to element
	public static void contextClick(WebElement e) {
		Actions acc = new Actions(driver);
		acc.contextClick(e);
	}

}
