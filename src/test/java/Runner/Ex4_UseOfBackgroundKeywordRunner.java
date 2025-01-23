package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\6th July 2024\\Workspace\\6thJuly_CucumberProjrct\\src\\test\\resources\\FeatureFiles\\Ex4_UseOfBackgroundKeyword.feature"},
		glue = {"Steps"}
		)

public class Ex4_UseOfBackgroundKeywordRunner extends AbstractTestNGCucumberTests
{
	

}
