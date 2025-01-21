package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	@Given("user is at login page")
	public void user_is_at_login_page() 
	{
	    System.out.println("at login page");
	}

	@When("user enter UN")
	public void user_enter_un() 
	{
		System.out.println("Enter UN");
	}

	@When("user enter PWD")
	public void user_enter_pwd()
	{
		System.out.println("Enter Pwd");
	}

	@When("user click on login btn")
	public void user_click_on_login_btn() 
	{
	    System.out.println("Click on login btn");
	}

	@Then("user should redirect to home page")
	public void user_should_redirect_to_home_page() 
	{
	    System.out.println("At Home Page");
	}

}
