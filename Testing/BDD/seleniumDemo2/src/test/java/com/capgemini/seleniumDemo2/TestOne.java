package com.capgemini.seleniumDemo2;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
	@Test
	public void tsetOne() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actiTIME.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		
		String expected = "actiTIME - Enter Time-Track";
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
