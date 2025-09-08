package com.cucurunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\resources\\com.feature\\Naukri.feature",
  glue="com.stepdefinition",
  monochrome = true,
  publish=true,
  dryRun=false,
  plugin= {"html:Reports/Naukri.html","pretty","json:Reports/Naukri.json"})



public class NaukriRunner {

}
