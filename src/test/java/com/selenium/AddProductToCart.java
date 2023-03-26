package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddProductToCart {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		String excpectedurl = driver.getCurrentUrl();

		String actualurl = "https://www.saucedemo.com/";

		if (excpectedurl.equals(actualurl)) {
			System.out.println("Page is correct");

		} else {
			System.out.println("Page is incorrect");
		}

		String expectedTitle = "Swag Labs";

		String actual = driver.getTitle();

		if (expectedTitle.equals(actual)) {
			System.out.println("Page is correct");
		} else {
			System.out.println("Page is incorrect");
		}

		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");

		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

		Thread.sleep(2000);

		
		
//		driver.navigate().back();
//
//		Thread.sleep(2000);
//
//		driver.navigate().forward();
//
//		Thread.sleep(2000);
//
//		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.quit();

	}

}
