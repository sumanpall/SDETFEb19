package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	
	WebDriver driver;
	
	@Given("^Jeff has brought a microwave for (\\d+)$")
	public void jeff_has_brought_a_microwave_for(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Brought microwave");
	}

	@Given("^he has no receipt$")
	public void he_has_no_receipt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("receipt is available");
	}
	
	@When("^Jeff returned the faulty microwave$")
	public void jeff_returned_the_faulty_microwave() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Returned microwave");
	}

	@Then("^Jeff should not get refund of (\\d+)$")
	public void jeff_should_not_get_refund_of(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	@Given("^Jane open the application$")
	public void jane_open_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Jane open the application");
		//Configure the chrome driver with port details
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
				
		//configure the browser
		driver=new ChromeDriver();
		//open the URL
		driver.get("http://newtours.demoaut.com/");
	}

	@Given("^application is opened$")
	public void application_is_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("application is opened");
		//title of the page
		String str_tit=driver.getTitle();
		//System.out.println(str_tit);
		if(str_tit.equalsIgnoreCase("Welcome: Mercury Tours")) {
			System.out.println("app opening is success");
		}
		
		
	}

	@When("^Jane provides \"([^\"]*)\" and \"([^\"]*)\" as credentials$")
	public void jane_provides_and_as_credentials(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("username"+arg1+" password"+arg2);
		driver.findElement(By .name("userName")).sendKeys(arg1);
		driver.findElement(By .name("password")).sendKeys(arg2);
		driver.findElement(By .name("login")).click();
	}

	@Then("^Jane is logged into the system$")
	public void jane_is_logged_into_the_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Jane is successfully login");
		driver.close();
		
		
	}
	
	@When("^the jane provides the credentials$")
	public void the_jane_provides_the_credentials(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		
		List<List<String>> data =arg1.raw();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		
	}

	@Then("^sinup is successful$")
	public void sinup_is_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	
	
	
	@Given("^Refund is completed$")
	public void refund_is_completed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Refund is completed");
	}

}
