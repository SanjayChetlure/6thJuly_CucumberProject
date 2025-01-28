package Steps;

import org.testng.Assert;

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
	    System.out.println("---Home Page Visible---");
	}
	
	@Then("title of App should be visible")
	public void title_of_app_should_be_visible() 
	{
	    System.out.println("--title visible---");
//	    Assert.assertEquals("Hi", "Hello","Failed: both results are mismatch");
	}
	
	
	
	@When("user enter UN as {string}")
	public void user_enter_un_as(String string)
	{
		System.out.println("username: "+string);
	}

	@When("user enter PWD as {string}")
	public void user_enter_pwd_as(String string) 
	{
		System.out.println("Password: "+string);
	}

	@When("user enter pin {int}")
	public void user_enter_pin(Integer int1) 
	{
		System.out.println("Pin: "+int1);
	}

	@Then("user profile picture should be visible")
	public void user_profile_picture_should_be_visible() 
	{
		System.out.println("Profile picture visible");
	}
	
	
	@Then("get title & verify")
	public void get_title_verify() 
	{
	   System.out.println("--title verified--");
	}

	@When("user click on profile tab")
	public void user_click_on_profile_tab() 
	{
	    System.out.println("click on profile tab");
	}

	@Then("verify profile name")
	public void verify_profile_name() 
	{
	   System.out.println("---Profile name verified--");
	}

	@Then("user click on logout btn")
	public void user_click_on_logout_btn()
	{
	    System.out.println("--logged out from app---");
	}
	
	
	@Then("url should contain {string}")
	public void url_should_contain(String string) 
	{
		System.out.println("URL: "+string);
	}
	
	
	@Then("verify profile picture")
	public void verify_profile_picture() 
	{
		System.out.println("profile picture verified");
	}


}
