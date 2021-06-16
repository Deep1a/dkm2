package locatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrm2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		WebDriverWait wait=new WebDriverWait(driver,50);
		WebElement username= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
		username.sendKeys("Admin");
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPassword")));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		WebElement marketplace= driver.findElement(By.id("MP_link"));
		marketplace.click();
		

	}

}
