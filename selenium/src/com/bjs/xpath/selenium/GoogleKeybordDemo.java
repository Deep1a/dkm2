package com.bjs.xpath.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleKeybordDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search= driver.findElement(By.name("q"));
		Actions a= new Actions(driver);
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("bjshub").pause(2000).sendKeys(Keys.ENTER).build().perform();


	}

}
