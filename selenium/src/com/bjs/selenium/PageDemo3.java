package com.bjs.selenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageDemo3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Deepak/Desktop/page1.html");
		WebElement link1=driver.findElement(By.linkText("GoToPage2"));
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		link1.click();
		Set<String>allids=driver.getWindowHandles();
		System.out.println(allids);
		ArrayList<String> al=new ArrayList<String>(allids);
		driver.switchTo().window(al.get(1));
		
		WebElement link2= driver.findElement(By.linkText("GoToPage3"));
		link2.click();

	}

}
