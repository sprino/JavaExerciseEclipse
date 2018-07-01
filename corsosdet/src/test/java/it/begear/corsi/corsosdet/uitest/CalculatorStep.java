package it.begear.corsi.corsosdet.uitest;

import  static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.hamcrest.Matchers.*;

public class CalculatorStep {
	
	private WebDriver driver;
	private CalculatorPage calculatorPage;
	private int numero1, numero2;
	
	@Given("^the form is loaded$")
	public void the_form_is_loaded() throws Throwable {
		driver = Utility.ui().driver();
		calculatorPage = new CalculatorPage(driver).get();
	}

	@When("^The user focuses the page$")
	public void the_user_focuses_the_page() throws Throwable {
		calculatorPage.focusPage();
	}

	@Then("^The system shows input field setted to '(\\d+)'$")
	public void the_system_shows_input_field_setted_to(int value) throws Throwable {
		//assertThat("num1 Assert", calculatorPage.getNum1(), equalTo(value));
		numero1 = value;
	}

	@Then("^The num(\\d+) input field setted to '(\\d+)'$")
	public void the_num_input_field_setted_to(int arg1, int arg2) throws Throwable {
		//assertThat("num2 Assert", calculatorPage.getNum2(), equalTo(arg2));
		numero2=arg2;
		calculatorPage.scrivi(Integer.toString(numero1), Integer.toString(numero2));
	}

	@Then("^The sum '(\\d+)'$")
	public void the_sum(int res) throws Throwable {
		assertThat("sum Assert", calculatorPage.getRes(), equalTo(Integer.toString(numero1+numero2)));
	}

	@Then("^A clear button$")
	public void a_clear_button() throws Throwable {
		assertThat("clearPresent", calculatorPage.isClearPresent(), equalTo(true));
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {

	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {

		
	driver.close();
	}
	
}
