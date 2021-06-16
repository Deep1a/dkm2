package com.bjs.xpath.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonDemo {

	public static void main(String[] args) {
		// demo of mouse event
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement acc= driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		WebElement youracc= driver.findElement(By.xpath("//span[text()='Your Account']"));
		Actions a =new Actions(driver);
		a.moveToElement(acc).build().perform();
		a.moveToElement(youracc).click().build().perform();
		//a.moveToElement(acc).moveToElement(youracc).click().build().perform()

	}

}
