package com.bjs.selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		int size=link.size();
		System.out.println(size);
		for(WebElement links:link) {
			String text=links.getText();
			System.out.println(text);
			
		}

	}

}
