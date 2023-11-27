package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RootStepdefs {
    private Calculator calculator;
    private int a;
    private int b;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        a = arg0;
        b = arg1;
    }

    @When("^I f the two values$")
    public void iAddTheTwoValues() {
        result = calculator.f(a, b);
        System.out.print(result);
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
