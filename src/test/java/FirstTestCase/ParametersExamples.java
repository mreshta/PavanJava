package FirstTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersExamples {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })

	public void setup(String browser, String url) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(url);
	}

	@Test(priority = 1)
	public void logoTest() {
		WebElement eLogo = driver.findElement(By.xpath("//a[text()='TEKSCHOOL']"));
		Assert.assertTrue(eLogo.isDisplayed(), "Logo not present on the page");
//		assertEquals(eLogo, "TEKSCHOOL");
	}

	@Test(priority = 2)
	public void logoMatched() {

		String title = driver.getTitle();
		Assert.assertEquals(title, "React App", "Title is not matched");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
