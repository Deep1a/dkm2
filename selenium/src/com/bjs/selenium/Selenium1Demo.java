package com.bjs.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","E:\\selenium component\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String url="https://www.youtube.com/";
		driver.get(url);
		String title=driver.getTitle();
		System.out.println(title);
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
