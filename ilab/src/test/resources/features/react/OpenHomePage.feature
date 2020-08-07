Feature: Apply for Job Opening

  Scenario: Launch Browser and Navigate to iLab Homepage
    Given : User launch the iLab website
    Then : User must be on the home page


  Scenario Outline: Apply for job opening
    Given : User launch the iLab website
    When : User must be on the home page
    And : User clicks on careers link
    And : User clicks on South Africa link
    And : Selects the first opening on the list
    And : clicks apply online
    And : fills out the form and enters <name> and <email>
    And : clicks send button application
    Then : Error message must be displayed

    Examples:
    | name | email|
    |Bongani Maphiri | b.maphiri@gmail.com|
    |Refiloe Mohodi  | refiloe.mohodi@ilabquality.com|