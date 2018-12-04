package com.cg.capbook.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"feature"}, glue= {"com.cg.capbook.stepdefinition"})
public class TestRunner {
}
