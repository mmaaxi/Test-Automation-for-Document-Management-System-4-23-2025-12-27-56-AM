package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_004Page;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page documentUploadPage;

    @Given("the user navigates to the document upload section")
    public void navigateToDocumentUploadSection() {
        documentUploadPage = new tc_004Page(driver);
        documentUploadPage.goToPage();
    }

    @When("the user initiates the document upload process")
    public void initiateDocumentUploadProcess() {
        documentUploadPage.startDocumentUpload();
    }

    @Then("the UI is clear and instructions to upload documents are easy to follow")
    public void verifyClarityOfUI() {
        Assert.assertTrue(documentUploadPage.isUIClaritySufficient());
    }

    @Then("the system clearly displays which documents are mandatory")
    public void verifyMandatoryDocumentIndicators() {
        Assert.assertTrue(documentUploadPage.hasMandatoryDocumentIndicators());
    }
}