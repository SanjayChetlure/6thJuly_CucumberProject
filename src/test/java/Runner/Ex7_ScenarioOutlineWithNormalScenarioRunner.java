package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\6th July 2024\\Workspace\\6thJuly_CucumberProjrct\\src\\test\\resources\\FeatureFiles\\Ex7_ScenarioOutlineWithNormalScenario.feature"},
		glue = {"Steps"},
		publish = true
		)

public class Ex7_ScenarioOutlineWithNormalScenarioRunner extends AbstractTestNGCucumberTests
{
	

}
