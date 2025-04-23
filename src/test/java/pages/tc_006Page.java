package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {

    WebDriver driver;

    // Locators
    private By renewSameConditionsOption = By.id("renew-same-conditions");
    private By uploadButton = By.id("upload-documents");
    private By processButton = By.id("process-renewal");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToRenewalPage() {
        driver.get("https://example.com/insurance/renewal");
    }

    public void selectRenewSameConditions() {
        driver.findElement(renewSameConditionsOption).click();
    }

    public void verifyUploadCapability() {
        if (!driver.findElement(uploadButton).isEnabled()) {
            throw new IllegalStateException("Upload button is not enabled.");
        }
    }

    public void uploadDocuments() {
        driver.findElement(uploadButton).click();
        // Insert logic to handle file upload
        // e.g., driver.findElement(By.id("file-upload")).sendKeys("/path/to/document.pdf");
    }

    public void verifyDocumentUploadSuccess() {
        if (!driver.findElement(processButton).isDisplayed()) {
            throw new IllegalStateException("Documents were not uploaded successfully or renewal was not processed.");
        }
    }
}