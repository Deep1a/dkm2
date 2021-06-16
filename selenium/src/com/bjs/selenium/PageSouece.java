package com.bjs.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSouece {

	public static void main(String[] args) {
		// program to find page source if web application
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String title =driver.getTitle();
		System.out.println(title);
		String ps= driver.getPageSource();
		System.out.println(ps);

	}

}
