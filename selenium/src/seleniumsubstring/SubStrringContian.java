package seleniumsubstring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubStrringContian {

	public static void main(String[] args) {
		//selenium substring using contain
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		WebElement name = driver.findElement(By.cssSelector("input[name*='ai']"));
		name.sendKeys("jemsbond@007");

	}

}
