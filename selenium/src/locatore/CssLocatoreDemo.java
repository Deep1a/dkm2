package locatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatoreDemo {

	public static void main(String[] args) {
		// find the web element using tag and id in css selector
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email= driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("samrat@007");
		WebElement pass=driver.findElement(By.cssSelector("input#pass"));
		pass.sendKeys("maurya@123");

	}

}
