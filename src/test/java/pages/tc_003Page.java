import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;

    // UI Elements
    By uploadInput = By.id("uploadInput");
    By extractedData = By.id("extractedData");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToOCRPage() {
        driver.get("http://example.com/ocr");
    }

    public void uploadDocument(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
    }

    public boolean validateDataExtraction() {
        // Implementation of data validation logic
        String data = driver.findElement(extractedData).getText();
        // Assume we have some method to check the extracted data's accuracy
        return isDataAccurate(data);
    }

    private boolean isDataAccurate(String data) {
        // Dummy implementation of data accuracy validation
        return data.contains("Expected Text");
    }
}