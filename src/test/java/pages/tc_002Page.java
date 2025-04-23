package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton"); // Example locator
    By errorMessage = By.id("errorMessage"); // Example locator

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload"); // Example URL
    }

    public void uploadLargeFile() {
        // Example script to simulate file upload of a large file
        driver.findElement(uploadButton).sendKeys("path/to/large/file"); // Update path as needed
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}