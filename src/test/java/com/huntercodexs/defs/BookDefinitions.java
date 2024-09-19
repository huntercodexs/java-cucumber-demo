package com.huntercodexs.defs;

import com.huntercodexs.cucumberdemo.BookService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BookDefinitions {

    private boolean result;
    private BookService bookService;

    @Given("My library is initialized")
    public void myLibraryIsInitialized() {
        bookService = new BookService();
    }

    @When("Making a research the book name {string}")
    public void makingAResearchTheBookName(String bookName) {
        result = bookService.findBook(bookName);
    }

    @Then("The book is found successfully")
    public void theBookIsFoundSuccessfully() {
        Assert.assertTrue(result);
    }

    @Then("The book is not found")
    public void theBookIsNotFound() {
        Assert.assertFalse(result);
    }
}
