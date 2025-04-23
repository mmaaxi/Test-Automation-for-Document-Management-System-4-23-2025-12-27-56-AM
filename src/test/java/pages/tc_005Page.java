import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class tc_005Page {
    private WebDriver driver;
    private WebDriverWait wait;

    private By uploadButton = By.id("upload-button");
    private By originalDocumentNotification = By.id("original-doc-notification");
    private By extractedDataNotification = By.id("extracted-data-notification");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void openDocumentProcessingSystem() {
        driver.get("http://example.com/document-processing");
    }

    public void uploadDocuments() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.click(); // Assuming file selection and upload happen through OS dialog
    }

    public boolean isOriginalDocumentStored() {
        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(originalDocumentNotification));
        return notification.isDisplayed();
    }

    public boolean isExtractedDataStored() {
        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(extractedDataNotification));
        return notification.isDisplayed();
    }
}