package stepsDefinitons;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Login.Feature",glue ={"stepsDefinitions"})
class Test_Runner {
}