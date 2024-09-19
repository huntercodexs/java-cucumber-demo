package cucumber.definitions;

import com.huntercodexs.cucumberdemo.Student;
import com.huntercodexs.cucumberdemo.StudentEnum;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StudentTestSteps {

    Student student;

    @Given("student class instanced")
    public void studentClassInstanced() {
        student = new Student();
    }

    @When("the average {int}")
    public void theAverageAverage(int avg) {
        student.setAverage(avg);
    }

    @And("the frequency {string}")
    public void theFrequencyFrequency(String frequency) {
        this.student.setFrequency(Integer.parseInt(frequency));
    }

    @Then("the student status should be {}")
    public void theStudentStatusShouldBeStatus(StudentEnum status) {
        Assert.assertEquals(status.name(), this.student.studentStatus().name());
    }
}
