Feature: Renew insurance policy with the same conditions

  Scenario: Renew policy using existing conditions
    Given the user is on the policy renewal page
    When the user selects the option to renew with the same conditions
    Then the system allows the user to upload required documents without changes
    When the user uploads necessary documents
    Then the documents are uploaded successfully and the system processes the renewal