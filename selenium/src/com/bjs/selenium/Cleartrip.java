package com.bjs.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		WebElement roundtrip=driver.findElement(By.id("RoundTrip"));
		if(roundtrip.isSelected()) {
			System.out.println("RoundTrip is selected");
		}
		else {
			roundtrip.click();
		}
		//WebElement returndate=driver.findElement(By.id("ReturnDate"));

	}

}
