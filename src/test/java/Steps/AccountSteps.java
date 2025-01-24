package Steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSteps 
{
	
	
	@Given("user should be at account opening page")
	public void user_should_be_at_account_opening_page() 
	{
		System.out.println("at acc opening page");
	}

	@When("user enters following data")
	public void user_enters_following_data(DataTable dt) 
	{
		List<List<String>> data = dt.asLists();
		String info = data.get(3).get(3);
		System.out.println("==="+info);
		
		System.out.println(data.get(1).get(1));
		System.out.println(data.get(2).get(1));
		
	}

	@When("user click on submit btn")
	public void user_click_on_submit_btn() 
	{
		System.out.println("click on submit btn");
	}

	@Then("user get created")
	public void user_get_created()
	{
		System.out.println("--user created--");
	}

}
