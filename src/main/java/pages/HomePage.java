package pages;

import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
 public HomePage(WebDriver driver) {
	this.driver=driver;
}
 private WebDriver driver;
 private By txtSearchBox =By.id("search-chatInput");
 private By BtnCalculator = By.xpath("(//div[@searchterm=\"Personal Loan\"]/descendant::span[text()='Calculator'])[2]");
 

 
 public void searchOnSearchBox() {
	 driver.findElement(txtSearchBox).sendKeys("Personal Loan");
 }
 public void clickOnCalculator() {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click()", driver.findElement(BtnCalculator));
	 Set<String> wid = driver.getWindowHandles();
	 Object[] arr = wid.toArray();
	 System.out.println("WID are"+Arrays.toString(arr));
	 driver.switchTo().window(arr[1].toString());
	 
 }
}
