package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//feature
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/Login.feature",
        glue = "stepDefinitions", stepNotifications = true, tags = "@SmokeTest")

public class TestRunner{


}
