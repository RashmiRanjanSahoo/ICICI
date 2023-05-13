package appHooks;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.Before;

public class Hooks {
 private WebDriver driver;
	@Before
	public void initBrowser() {
		DriverFactory df=new DriverFactory();
		driver=df.setDriver("chrome");
		driver.get("https://www.icicibank.com/");
	}
}
