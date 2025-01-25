package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class SampleHooks
{
	@Before                      //before hook
	public void loginToApp() 
	{
		System.out.println("---Running before Hook---");
	}
	
	@After                      //after hook
	public void logoutFromApp() 
	{
		System.out.println("---Running after Hook---");
	}
	

//	@BeforeStep                     //before Step hook
//	public void beforeStepHook() 
//	{
//		System.out.println("-Running before Step Hook-");
//	}
//	
//	@AfterStep                      //after Step hook
//	public void afterStepHook() 
//	{
//		System.out.println("-Running after Step Hook-");
//	}
	

}
