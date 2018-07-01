package it.begear.corsi.corsosdet.uitest;

import org.junit.runner.RunWith;								 
import cucumber.api.CucumberOptions;						     
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)						        
@CucumberOptions ( plugin = {"json:target/reports/tableTest.json" } )	

public class CalculatorTest {

}
