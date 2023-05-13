package factory;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
 public static WebDriver driver;
 
 public WebDriver setDriver(String BrowserName) {
	 if(BrowserName.equals("chrome")) {
		driver= WebDriverManager.chromedriver().create();
	 }
	 getDriver().manage().window().maximize();
	 return getDriver();
 }
 
 public static WebDriver getDriver() {
	 return driver;
 }
}
