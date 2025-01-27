package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\6th July 2024\\Workspace\\6thJuly_CucumberProjrct\\src\\test\\resources\\FeatureFiles"},
		glue = {"Steps"},
		publish = true,
		dryRun = true
		)

public class Ex13_dryRunRunner extends AbstractTestNGCucumberTests
{
	

}
