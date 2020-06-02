package webDriverMavenGit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Logintest {

	public static WebDriver driver;
	@BeforeSuite
	public static void setup(){
		
		driver = new ChromeDriver();
		
	}
		
	
	@Test
	public static void login(){
		driver.get("http://gmail.com");	
		System.out.println("modifying");
	}

	@AfterSuite
	public static void teardown(){
		
		driver.quit();
		
	}
}
