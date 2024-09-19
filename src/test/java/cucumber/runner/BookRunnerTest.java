package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/cucumber/feature/Book.feature",
        glue = "cucumber.definitions",
        tags = "@BookTest",
        plugin = {"pretty", "html:target/cucumber-reports/report.html"}
)
public class BookRunnerTest {
}
