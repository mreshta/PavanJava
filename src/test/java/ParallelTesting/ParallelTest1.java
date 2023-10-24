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

public class ParallelTest1 {
	WebDriver driver;
	
	@Test
	public void logoTest() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		WebElement logo = driver.findElement(By.xpath("//a[text()='TEKSCHOOL']"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(5000);
	}

	@Test
	public void homePageTitle() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
