package com.bjs.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
		String title=driver.getTitle();
		System.out.println(title);
		

	}

}
