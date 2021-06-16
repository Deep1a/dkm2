package locatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shadi.com/");
		WebElement shadi = driver.findElement(By.id("ddlEducation"));
		Select s = new Select(shadi);
		//select by index
		//s.selectByIndex(2);
		// select by value
		//s.selectByValue("3");
		//visible text
		s.selectByVisibleText("High School");

	}

}
