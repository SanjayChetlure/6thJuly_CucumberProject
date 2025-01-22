package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\6th July 2024\\Workspace\\6thJuly_CucumberProjrct\\src\\test\\resources\\FeatureFiles\\Ex2_MultipleScenarioInSingleFeatureFile.feature"},
		glue = {"Steps"}
		)

public class Ex2_MultipleScenarioInSingleFeatureFileRunner extends AbstractTestNGCucumberTests
{
	

}
