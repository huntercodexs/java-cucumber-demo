package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/cucumber/feature/Student.feature",
        glue = "cucumber.definitions",
        plugin = {"pretty", "html:target/cucumber-reports/report.html"}
)
public class StudentRunnerTest {
}
