package seleniumhandlindropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropeDown {

	public static void main(String[] args) {
		// handling dropdown or combo box
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shadi.com/");
		WebElement dropdown=driver.findElement(By.id("ddlEducation"));
		Select s= new Select(dropdown);
		//using index
		//s.selectByIndex(2);
		//using value
		s.selectByValue("2");
		//using visible text
		//s.selectByVisibleText("High School");
		

	}

}
