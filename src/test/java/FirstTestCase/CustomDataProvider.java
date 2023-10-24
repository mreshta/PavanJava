package FirstTestCase;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	@DataProvider(name="LoginTest")
	public Object[][] getData() {
		Object[][] data = { { "abc@gmail.com", "abc" }, { "def@gmail.com", "def" }, { "hkl@gmail.com", "hkl" } };

		return data;
	}
}
