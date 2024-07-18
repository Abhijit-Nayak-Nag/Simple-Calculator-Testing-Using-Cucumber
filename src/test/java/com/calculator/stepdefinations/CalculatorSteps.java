package com.calculator.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private int result;
    private int number1;
    private int number2;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        System.out.println("Welcome to the calculator.");
        // Setup for the calculator can be done here if needed
    }

    @When("I add {int} and {int}")
    public void i_add_and(int num1, int num2) {
        number1= num1;
        number2= num2;
        result= num1+num2;

    }

//    @Then("the result of {int} and {int} should be {int}")
     @Then("the result should be {int}")
//    public void the_result_should_be(int int1, int int2, int expectedResult) {
     public void the_result_should_be(int expectedResult){
//        int a= int1+int2;
//      assertEquals(expectedResult, int1 + int2);
//        assertEquals(expectedResult,a);
//      System.out.println(int1 + int2);

        assertEquals(expectedResult,result);
        System.out.println(result);
        System.out.println(number1 + " "+ number2  + " " + result);
    }
}


