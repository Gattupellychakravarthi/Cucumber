Feature: Flipkart search
 
 @smoketest
  Scenario: Searcing for apple mobile
    Given Launch the Browser
    When Enter URL
    Then Wait for page Loading
    And Search for apple mobiles 
    Then Close the Browser
    
  @regressiontest  
   Scenario: Searcing for Samsung TV
    Given Launch the Browser
    When Enter URL
    Then Wait for page Loading
    And Search for "SAMSUNG TV"
    Then Close the Browser
   
