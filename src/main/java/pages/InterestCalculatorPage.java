package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InterestCalculatorPage {
	private WebDriver driver;
	public InterestCalculatorPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By txtLoanAmount =By.id("loan-amt-personal-input");
	private By txtEmiAmount =By.id("emi_amt_personal");
	public void setLoanAmount() {
		driver.findElement(txtLoanAmount).clear();
		driver.findElement(txtLoanAmount).sendKeys("1000000");
	}
	public String getEMIAmount() {
		String Emi=driver.findElement(txtEmiAmount).getText();
		return Emi;
	}

}
