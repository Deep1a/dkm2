package locatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorDemo2 {

	public static void main(String[] args) {
		// find the web element using tag and class in css selectore
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		WebElement email = driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy"));
		email.sendKeys("maurya@007");
		WebElement pass=driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi"));
		pass.sendKeys("samrat#007");

	}

}
