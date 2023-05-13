package stepdef;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.InterestCalculatorPage;

public class PersonalLoanStepDef {
	HomePage hp=new HomePage(DriverFactory.getDriver());
	InterestCalculatorPage ic=new InterestCalculatorPage(DriverFactory.getDriver());
	
	@Given("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
	    hp.searchOnSearchBox();
	    Thread.sleep(2000);
	    hp.clickOnCalculator();
	    Thread.sleep(4000);
	    ic.setLoanAmount();
	    Thread.sleep(4000);
	    String emi=ic.getEMIAmount();
	    System.out.println("The EMI amount is "+emi);
	}
}
