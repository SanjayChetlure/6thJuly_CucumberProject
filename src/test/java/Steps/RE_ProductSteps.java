package Steps;

import org.testng.Assert;

import LibraryFiles.DriverFactory;
import Module1_Login.SwagLabHomePage;
import io.cucumber.java.en.Then;

public class RE_ProductSteps 
{
	SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);
	
	@Then("product name should be {string}")
	public void product_name_should_be(String expProductName)
	{
	    String actProductName = home.getSwagLabHomePageOnesieProduct();
	    Assert.assertEquals(actProductName, expProductName, "Failed:- Product Name Mismatch");
	}
	
	
	@Then("product price should be {double}")
	public void product_price_should_be(Double expProductPrice)
	{
	    double actProductPrice = home.getSwagLabHomePageOnesieProductPrice();
	    Assert.assertEquals(actProductPrice, expProductPrice,"Failed: product price mismatch");
	}

	@Then("product size should be {int}")
	public void product_size_should_be(Integer expProductSize) 
	{
		int actProductSize = home.getSwagLabHomePageAllProductSize();
		Assert.assertEquals(actProductSize, expProductSize,"Failed:- Product size mismatch");
	}

	@Then("all product price should be  {double}")
	public void all_product_price_should_be(Double expTotalProductPrice) 
	{
		double actTotalProductPrice = home.getSwagLabHomePageAllProductPriceSum();
		Assert.assertEquals(actTotalProductPrice, expTotalProductPrice, "Failed;- Total Product price mismatch");
	}

}
