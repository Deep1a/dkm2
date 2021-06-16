package com.bjs.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your browser");
		Scanner s= new Scanner(System.in);
		String browser=s.next();

		if(browser.equalsIgnoreCase("Firefox")) {
			FirefoxDriver f= new FirefoxDriver();
			test(f);
		}
		else if(browser.equalsIgnoreCase("Chrome")) {
			ChromeDriver c= new ChromeDriver();
			test(c);
		}
		else {
			System.out.println("enter the viled browser");
		}

	}
	public static void test(WebDriver driver) {
		driver.get("https://www.youtube.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
	}

}
