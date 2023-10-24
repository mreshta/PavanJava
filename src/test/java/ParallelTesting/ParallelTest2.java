package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest2 {
	WebDriver driver;
	
	@Test
	public void loginTest() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign in']"));
		signIn.click();
		WebElement userName = driver.findElement(By.cssSelector("input[name='email']"));
		userName.sendKeys("Alpha390@gmail.com");
		WebElement pass = driver.findElement(By.cssSelector("input[name='password']"));
		pass.sendKeys("Alpha123*");
		driver.findElement(By.cssSelector("button[id='loginBtn']")).click(); 
		
		
	}

	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
