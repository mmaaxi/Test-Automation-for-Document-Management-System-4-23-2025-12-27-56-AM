package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page uploadPage;

    @Given("the user is on the file upload page")
    public void the_user_is_on_the_file_upload_page() {
        // Assuming driver is initialized and directed to the upload page
        uploadPage = new tc_002Page(driver);
        uploadPage.navigateToUploadPage();
    }

    @When("the user attempts to upload a file of 51 MB")
    public void the_user_attempts_to_upload_a_file_of_51_mb() {
        uploadPage.uploadLargeFile();
    }

    @Then("an error message is displayed indicating the file size exceeds the allowed limit")
    public void an_error_message_is_displayed_indicating_the_file_size_exceeds_the_allowed_limit() {
        String expectedErrorMessage = "The file size exceeds the allowed limit.";
        Assert.assertEquals(expectedErrorMessage, uploadPage.getErrorMessage());
    }
}