package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginclass {

static	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();

		driver.get("https://www.saucedemo.com/");
	}

	@Test
	public void logintest() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void teardown() {

		driver.close();
	}

}
