package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\6th July 2024\\Workspace\\6thJuly_CucumberProjrct\\src\\test\\resources\\FeatureFiles\\RE1_LoginToSwagLab.feature"},
		glue = {"Steps","REHooks"},
		plugin = {"pretty","html:target/cucumberReports/SwagLabLoginReport.html"}
		)

public class RE1_LoginToSwagLabRunner extends AbstractTestNGCucumberTests
{
	

}
