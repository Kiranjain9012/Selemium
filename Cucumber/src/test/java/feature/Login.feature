Feature: Application Login

Scenario: Home page default Login
Given User is on landing page
When User login into application with username and password
Then User is navigated to Home page
And Cards are displayed