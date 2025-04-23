package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_006Page;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page renewalPage;

    public tc_006Steps() {
        driver = Hooks.driver;
        renewalPage = new tc_006Page(driver);
    }

    @Given("the user is on the policy renewal page")
    public void the_user_is_on_the_policy_renewal_page() {
        renewalPage.navigateToRenewalPage();
    }

    @When("the user selects the option to renew with the same conditions")
    public void the_user_selects_the_option_to_renew_with_the_same_conditions() {
        renewalPage.selectRenewSameConditions();
    }

    @Then("the system allows the user to upload required documents without changes")
    public void the_system_allows_the_user_to_upload_required_documents_without_changes() {
        renewalPage.verifyUploadCapability();
    }

    @When("the user uploads necessary documents")
    public void the_user_uploads_necessary_documents() {
        renewalPage.uploadDocuments();
    }

    @Then("the documents are uploaded successfully and the system processes the renewal")
    public void the_documents_are_uploaded_successfully_and_the_system_processes_the_renewal() {
        renewalPage.verifyDocumentUploadSuccess();
    }
}