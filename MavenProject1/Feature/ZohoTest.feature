Feature: ZohoTest scenarios

#@Before
Scenario: Login the zoho application successfully
Given User is on Home Page
When User Navigate to LogIn Page
And User enters UserName and Password
Then user is displayed with Zoho appa page


Scenario: Create a new application from scratch
Given the user click on the create application field
When I Select a new BlankForm template 
And I enter inputs for all the basic fields 
Then user is created with new Form successfully
And I Logout the application

