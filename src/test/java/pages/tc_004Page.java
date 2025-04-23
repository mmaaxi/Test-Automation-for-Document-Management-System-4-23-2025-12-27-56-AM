package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;
    // Locators
    By uploadSection = By.id("document-upload-section");
    By startUploadButton = By.id("start-upload");
    By mandatoryDocumentIndicator = By.cssSelector(".mandatory-document");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage() {
        driver.findElement(uploadSection).click(); // Navigate to document upload section
    }

    public void startDocumentUpload() {
        driver.findElement(startUploadButton).click(); // Start the document upload process
    }

    public boolean isUIClaritySufficient() {
        // Implement logic to check UI clarity and instructions
        return driver.findElements(By.cssSelector(".clear-instructions")).size() > 0;
    }

    public boolean hasMandatoryDocumentIndicators() {
        // Verify if the mandatory document indicators are present
        return driver.findElements(mandatoryDocumentIndicator).size() > 0;
    }
}