Feature: Validate storage of documents and extracted data

  Scenario: Load and process documents
    Given the user has access to the document processing system
    When the user uploads the documents for processing
    Then the system should store a copy of the original documents
    And the system should store the extracted data