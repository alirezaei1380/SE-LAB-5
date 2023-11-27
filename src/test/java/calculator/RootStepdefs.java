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
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input numbers, (-?\\d+) and (\\d+)$")
    public void twoInputNumbersAnd(int arg0, int arg1) {
        a = arg0;
        b = arg1;
    }

    @When("^I f the two values$")
    public void iFTheTwoValues() {
        result = calculator.f(a, b);
        System.out.print(result);
    }

    @Then("^I expect the result to be (\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
