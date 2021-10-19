package Testing;

import com.softwareinstitute.Genre;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})


public class cucumberTest {
    static String isItFictional (String fiction) { return String.valueOf("This is a fictional book".equals(fiction));}

        Genre fictionalTest = new Genre(" ", " ");
        String fiction;
        String itsFictional;

        @Given("I have found a book ")
        public void i_have_found_a_book_I_want() { fiction = "This is a fiction book";}

        @When("I know the genre")
        public void i_know_the_genre() { itsFictional = cucumberTest.isItFictional(fiction); }

        @Then("I will know if the book is fictional")
        public void i_will_know_if_the_book_is_fictional() {assertEquals (" ", itsFictional); }

}
