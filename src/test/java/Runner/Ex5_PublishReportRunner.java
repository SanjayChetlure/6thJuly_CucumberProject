package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\6th July 2024\\Workspace\\6thJuly_CucumberProjrct\\src\\test\\resources\\FeatureFiles\\Ex4_UseOfBackgroundKeyword.feature"},
		glue = {"Steps"},
		publish = true
		)

public class Ex5_PublishReportRunner extends AbstractTestNGCucumberTests
{
	

}
