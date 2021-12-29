
Feature: Vtiger Login

  Scenario: Login into Appln
    Given launch Browser 
    When enter url 
    And enter user name
    And enter password
    Then click on login
    Then close the browser
   

  Scenario: Login into Appln passing values during run time 
    Given launch Browser 
    When enter url "http://localhost:8888"
    And enter user name "admin"
    And enter password "123456"
    Then click on login
    Then close the browser
   