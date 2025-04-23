import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    private tc_005Page page;

    public tc_005Steps() {
        page = new tc_005Page();
    }

    @Given("the user has access to the document processing system")
    public void user_has_access_to_document_processing_system() {
        page.openDocumentProcessingSystem();
    }

    @When("the user uploads the documents for processing")
    public void user_uploads_documents_for_processing() {
        page.uploadDocuments();
    }

    @Then("the system should store a copy of the original documents")
    public void system_stores_copy_of_original_documents() {
        Assert.assertTrue(page.isOriginalDocumentStored());
    }

    @Then("the system should store the extracted data")
    public void system_stores_extracted_data() {
        Assert.assertTrue(page.isExtractedDataStored());
    }
}