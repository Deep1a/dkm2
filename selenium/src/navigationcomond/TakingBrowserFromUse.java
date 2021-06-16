package navigationcomond;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakingBrowserFromUse {

	public static void main(String[] args) {
		// taking browser from user 
		System.out.println("enter the browser");
		Scanner s= new Scanner(System.in);
		String browser = s.next();
		if(browser.equalsIgnoreCase("Firefox")) {
			FirefoxDriver f= new FirefoxDriver();
			test(f);
		}
		else if(browser.equalsIgnoreCase("ChromeDriver")) {
			ChromeDriver c= new ChromeDriver();
			test(c);
		}
		else {
			System.out.println("enter the vailed browser");
		}

	}
	public static void test(FirefoxDriver driver) {
		driver .get("https://www.youtube.com");
		String ftitle=driver.getTitle();
		System.out.println(ftitle);
		String furl= driver.getCurrentUrl();
		System.out.println(furl);
		driver.close();
		
	}
	public static void test(ChromeDriver driver) {
		driver.get("https://www.youtube.com");
		String ctitle=driver.getTitle();
		System.out.println(ctitle);
		String curl= driver.getCurrentUrl();
		System.out.println(curl);
		driver.close();
	}
	
	

}
