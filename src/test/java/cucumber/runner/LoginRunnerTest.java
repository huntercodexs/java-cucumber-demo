package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/cucumber/feature/Login.feature",
        glue = "cucumber.definitions",
        tags = "@LoginTest",
        plugin = {"pretty", "html:target/cucumber-reports/report.html"}
)
public class LoginRunnerTest {
}
