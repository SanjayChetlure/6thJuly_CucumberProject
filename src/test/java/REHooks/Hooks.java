package REHooks;

import java.io.IOException;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks 
{
	@Before
	public void openBrowser() throws IOException 
	{
		DriverFactory.initializeBrowser(UtilityClass.getPFData("browserName"));
	}
	
	@BeforeStep
	public void waitForFewSecBeforeEverySteps() throws IOException, InterruptedException 
	{
		Thread.sleep(1000);
	}
	
	@After
	public void closeBrowser() 
	{
		DriverFactory.driver.quit();
	}

}
