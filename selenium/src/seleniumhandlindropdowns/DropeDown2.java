package seleniumhandlindropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropeDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shadi.com/");
		WebElement name=driver.findElement(By.name("religion"));
		Select s= new Select(name);
		//s.selectByIndex(2);
		//s.selectByValue("1");
		s.selectByVisibleText("Hindu");

	}

}
