package com.bjs.selenium;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/javascript4.htm");
		//alert box popup
		WebElement alert= driver.findElement(By.name("B1"));
		alert.click();
	Alert a= driver.switchTo().alert();
	Thread.sleep(5000);
	a.accept();
	// confirom box popup
	WebElement confirm= driver.findElement(By.name("B2"));
	confirm.click();
	Alert c= driver.switchTo().alert();
	Thread.sleep(5000);
	c.dismiss();
	//prompt box popup
	WebElement prompt= driver.findElement(By.name("B3"));
	prompt.click();
	Alert p = driver.switchTo().alert();
 p.sendKeys("Deepak");
 Thread.sleep(5000);
 String text= p.getText();
 System.out.println(text);
 p.accept();
 
 
	

	}

}
