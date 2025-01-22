package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\6th July 2024\\Workspace\\6thJuly_CucumberProjrct\\src\\test\\resources\\FeatureFiles\\Ex3_PassInput(TD)FromFeatureFileIntoSDClass.feature"},
		glue = {"Steps"}
		)

public class Ex3_PassInput_TD_FromFeatureFileIntoSterpsClassRunner extends AbstractTestNGCucumberTests
{
	

}
