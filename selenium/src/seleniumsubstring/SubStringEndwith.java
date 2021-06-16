package seleniumsubstring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubStringEndwith {

	public static void main(String[] args) {
		// selenium substring using end with
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailid = driver.findElement(By.cssSelector("input[id$='il']"));
		emailid.sendKeys("samrat@007");

	}

}
