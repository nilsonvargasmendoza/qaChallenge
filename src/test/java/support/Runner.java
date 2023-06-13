package support;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features/usuario.feature", glue = "definitions",
        tags="@usuario", plugin = {"json:target/cucumber-report/cucumber.json"})

public class Runner {

}