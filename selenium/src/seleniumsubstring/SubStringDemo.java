package seleniumsubstring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubStringDemo {

	public static void main(String[] args) {
		// example of substring start with
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement name =driver.findElement(By.cssSelector("input[name^='em']"));
		name.sendKeys("deep@123");

	}

}
