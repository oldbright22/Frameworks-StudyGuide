Feature: Login section

  @RegressionTest
  Scenario: Successfully login to Website
    Given GotoWebPage
    When Login page loads, enter userId "btinajero@gmail.com" and password "Btg770616"
    And Press Login button
    Then validate logged-in successful and verify landing page


##Scenario - details of the scenario under test
##Feature  - feature under test
##Given    - pre-requisite for test ot be executed
##When     - trigger point for any test scenario
##And      - logical AND condition btw 2 statements
##Then     - holds expected result for the test to be executed
##But      - logical OR condition btw 2 statements
##Bkground - what to setup before every scenario runs

##This is how background can be used to eliminate duplicate steps

#  Background:
#  User navigates to WebPage Given
#  I am on WebPage login page

##Scenario with AND
#  Scenario:
#    When I enter username as "TOM"
#    And I enter password as "JERRY"
#    Then Login should fail

##Scenario with BUT
#  Scenario:
#    When I enter username as "TOM"
#    And I enter password as "JERRY"
#    Then Login should fail
#    But Relogin option should be available
