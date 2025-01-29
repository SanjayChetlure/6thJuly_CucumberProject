package Steps;

import java.io.IOException;

import org.testng.Assert;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import Module1_Login.SwagLabHomePage;
import Module1_Login.SwagLabLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RE1_LoginSteps 
{
	SwagLabLoginPage login=new SwagLabLoginPage(DriverFactory.driver);
	SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);
	
	@Given("user should be at login")
	public void user_should_be_at_login() throws IOException 
	{
	   DriverFactory.driver.get(UtilityClass.getPFData("URL"));
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String username) 
	{
	    login.inpSwagLabLoginPageUsername(username);
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String password)
	{
	   login.inpSwagLabLoginPagePassword(password);
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() 
	{
	    login.clickSwagLabLoginPageLoginBtn();
	}

	@Then("Home page should be visible with logo Text {string}")
	public void home_page_should_be_visible_with_logo_text(String expLogoText) 
	{
	   String actLogoText = home.getSwagLabHomePageLogoText();
	   Assert.assertEquals(actLogoText, expLogoText, "Failed- logo Text mismatch");
	}

}
