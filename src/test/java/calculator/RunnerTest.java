package calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/features", glue = "src/test/java/calculator")
@RunWith(Cucumber.class)
public class RunnerTest {

}
