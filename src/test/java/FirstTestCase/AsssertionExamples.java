package FirstTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AsssertionExamples {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://tek-retail-ui.azurewebsites.net/");
	}
	@Test
	public void logoTest() {
		WebElement eLogo = driver.findElement(By.xpath("//a[text()='TEKSCHOOL']"));
		Assert.assertTrue(eLogo.isDisplayed(), "Logo not present on the page");
//		assertEquals(eLogo, "TEKSCHOOL");
	}
	@Test
	public void logoMatched() {
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "React App", "Title is not matched");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
