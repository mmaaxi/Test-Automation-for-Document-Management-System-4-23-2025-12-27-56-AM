Feature: OCR Processing and Data Extraction Accuracy

  Scenario: Validate OCR and data extraction
    Given I navigate to the OCR upload page
    When I upload a document with clear and structured text
    Then the system should correctly read and extract all data from the document