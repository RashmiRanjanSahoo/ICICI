package runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:AppFeatures"},
		glue = {"stepdef","appHooks"},
		plugin = {"pretty"}
		)
public class JAR_Runner {
	public static void main(String[] args) {
		
	      Result result = JUnitCore.runClasses(JAR_Runner.class);
//	      for (Failure failure : result.getFailures()) {
//	         System.out.println(failure.toString());
//	      }
//	      System.out.println(result.wasSuccessful());
	   
}

}
