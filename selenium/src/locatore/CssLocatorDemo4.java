package locatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorDemo4 {

	public static void main(String[] args) {
		// finde the web element using substring method(start with ,end eith,contains) in css selector
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		// start with
		WebElement facebook= driver.findElement(By.cssSelector("input[id^='em']"));
		facebook.sendKeys("deepak maurya");
		//ends with
		//WebElement facebook= driver.findElement(By.cssSelector("input[id$='il']"));
		//facebook.sendKeys("samrat#007");
		//contains
		//WebElement facebook=driver.findElement(By.cssSelector("input[id*='ma']"));
		//facebook.sendKeys("maurya@007");

	}

}
