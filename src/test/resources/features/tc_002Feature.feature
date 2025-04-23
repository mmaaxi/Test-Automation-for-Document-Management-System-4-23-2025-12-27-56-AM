Feature: File upload validation
  Scenario: Validate file size restriction and error message
    Given the user is on the file upload page
    When the user attempts to upload a file of 51 MB
    Then an error message is displayed indicating the file size exceeds the allowed limit