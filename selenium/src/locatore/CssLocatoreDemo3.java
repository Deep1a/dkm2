package locatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatoreDemo3 {

	public static void main(String[] args) {
		// find the web element using tag and attribute in css electore
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email= driver.findElement(By.cssSelector("input[id='email']"));
		email.sendKeys("DeepakMaurya");
		WebElement name=driver.findElement(By.cssSelector("input[name='pass']"));
		name.sendKeys("samrat#007");

	}

}

