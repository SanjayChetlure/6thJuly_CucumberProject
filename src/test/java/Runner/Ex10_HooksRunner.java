package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\6th July 2024\\Workspace\\6thJuly_CucumberProjrct\\src\\test\\resources\\FeatureFiles\\E10_Hooks.feature"},
		glue = {"Steps", "Hooks"},
		publish = true
		)

public class Ex10_HooksRunner extends AbstractTestNGCucumberTests
{
	

}
