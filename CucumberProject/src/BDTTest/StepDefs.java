package BDTTest;

import cucumber.api.java.en.*;
import cucumber.api.java.After;

public class StepDefs {
	
	private SeleniumTest script;
	
	public void setUpWebDriver()throws Exception{
		
		script = new SeleniumTest();
		script.setUp();
		script.goToSite();
		
	}
	
	public void tidyUp(){
		
		script.tearDown();
		
	}
	
	@Given("^I navigate to the cinglevue website$")
	public void i_navigate_to_the_cinglevue_website() throws Throwable {
	    
	    setUpWebDriver();
	    
	}

	@When("^I search for cinglevue in the site search$")
	public void i_search_for_cinglevue_in_the_site_search() throws Throwable {
	    
	    script.searchCinglevue();
	}

	@Then("^the search result has more than (\\d+) links$")
	public void the_search_result_has_more_than_links(int arg1) throws Throwable {
	   
	    script.checkResult();
	}
	
	@After
	public void tearDown() throws Exception {

	   script.tearDown();

	}
}
