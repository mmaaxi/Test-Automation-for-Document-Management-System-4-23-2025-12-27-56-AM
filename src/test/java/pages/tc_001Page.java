package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverManager;

public class tc_001Page {

    WebDriver driver = WebDriverManager.getDriver();

    private By uploadInput = By.id("file-upload");
    private By pdfPreview = By.id("pdf-preview");
    private By docxPreview = By.id("docx-preview");
    private By zipContentsPreview = By.id("zip-contents-preview");

    public void navigateToUploadPage() {
        driver.get("http://yourwebsite.com/upload");
    }

    public void uploadPDF() {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys("/path/to/your/document.pdf");
    }

    public void verifyPDFPreviewIsDisplayed() {
        WebElement previewElement = driver.findElement(pdfPreview);
        if (!previewElement.isDisplayed()) {
            throw new AssertionError("PDF preview is not displayed");
        }
    }

    public void uploadDOCX() {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys("/path/to/your/document.docx");
    }

    public void verifyDOCXPreviewIsDisplayed() {
        WebElement previewElement = driver.findElement(docxPreview);
        if (!previewElement.isDisplayed()) {
            throw new AssertionError("DOCX preview is not displayed");
        }
    }

    public void uploadZIP() {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys("/path/to/your/documents.zip");
    }

    public void verifyZIPContentsPreviewIsDisplayed() {
        WebElement previewElement = driver.findElement(zipContentsPreview);
        if (!previewElement.isDisplayed()) {
            throw new AssertionError("ZIP contents preview is not displayed");
        }
    }
}