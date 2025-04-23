Feature: Verify UI functionality and clarity for document upload

  Scenario: Check document upload initiation and mandatory markers
    Given the user navigates to the document upload section
    When the user initiates the document upload process
    Then the UI is clear and instructions to upload documents are easy to follow
    And the system clearly displays which documents are mandatory