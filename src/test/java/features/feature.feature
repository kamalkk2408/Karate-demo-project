Feature: Basic Api Testing
  Scenario: API calls
    Given url 'http://localhost:9000'
    And header Authorization = "Bearer xxyvvkjkljdflkjna312"
    And path "/ping"
    When method GET
    Then status 200
    And print response
    And match response == "ALL IS WELL"


