package runner;

import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		features = {"src/test/resource"},        //Path of my feature file
		format = {"pretty" ,"json:target/cucumber.json"},    //format for the test
		strict = false,          //check if the steps are in my step definition file
        monochrome = true,       //display the console in a proper readable format
        tags = {"@Login"},
        glue = {"stepDefinitionTest"}       //path of my step definition ..where test code is
		         )


/*@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resource"},        //Path of my feature file
				format = {"pretty", "json:target/cucumber.json" },
				strict = false,          //check if the steps are in my step definition file
			    tags = {"~@Ignore"},
				glue = {"stepDefinitionTest"}  
		       )*/

public class RunnerTest {

}
