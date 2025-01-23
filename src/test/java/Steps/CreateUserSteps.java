package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateUserSteps 
{
	@Given("user in at signup page")
	public void user_in_at_signup_page()
	{
		System.out.println("at signup page");
	}

	@When("user enters name as {string} inside form")
	public void user_enters_name_as_inside_form(String name) 
	{
		System.out.println("Enter Name : "+name);
	}

	@When("user enters age as {int}")
	public void user_enters_age_as(Integer age)
	{
		System.out.println("Enter Age: "+age);
	}

	@When("user confirm gender as {string}")
	public void user_confirm_gender_as(String gender)
	{
		System.out.println("Enter Gender: "+gender);
	}

	@When("user enters mobNum as {int}")
	public void user_enters_mob_num_as(Integer mobNum) 
	{
		System.out.println("Enter Mob Num: "+mobNum);
	}

	@Then("user gets created")
	public void user_gets_created()
	{
		System.out.println("--User Created--");
	}

}
