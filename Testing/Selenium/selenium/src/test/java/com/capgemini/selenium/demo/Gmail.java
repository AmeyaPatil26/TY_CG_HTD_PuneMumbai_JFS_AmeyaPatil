package com.capgemini.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {

		System.setProperty("webdriver.chrome.driver", "./src/main/resource/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter the URL
		driver.get("https://www.gmail.com");
		//enter the valid username
		driver.findElement(By.id("identifierId")).sendKeys("15305051ameya@viva-technology.org");
		//click on next
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//enter valid password
		driver.findElement(By.name("password")).sendKeys("aomya1406");
		//click on next for login
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//click on compose
		//driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE L3']"));
		driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE L3']"));

	}
}
