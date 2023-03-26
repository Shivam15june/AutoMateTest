package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.id("user-name"));

		ele.sendKeys("standard_user");
		Thread.sleep(2000);

		WebElement el1 = driver.findElement(By.id("password"));

		el1.sendKeys("secret_sauce");
		Thread.sleep(2000);

		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);

		driver.quit();

	}
}
