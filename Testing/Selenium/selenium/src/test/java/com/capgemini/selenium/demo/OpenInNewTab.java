package com.capgemini.selenium.demo;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenInNewTab  {
	static {

		System.setProperty("webdriver.chrome.driver", "./src/main/resource/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();

	}
}
