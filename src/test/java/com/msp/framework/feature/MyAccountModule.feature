Feature: This feature is responsible for logging into Salesforce portal and create an Account


Background: 
#  Then I click Signin link
  When I enter EmailAddress and Password
  Then I click Sign in button
  Then I see the My Account page
  
 @SmokeTest
 Scenario Outline:  Update Account details to create an user account
   When I click on AppLauncher link and searched Accounts
   Then I directed to the Accounts page
   Then I add an account by clciking on new button
   Then I directed to the Account Creation Page
   When I Update "<Account Name>","<Phone>","<AccountNumber>","<Rating>","<Billing Address>","<Customer Priority>","<SLA>","<Description>" and click on save
#   Then I display with a successfull message in Your Personal Information section
#   Then I see the My Account page
#   Then I click on Logout button
#   And I directed to the logout page

   Examples:
     |Account Name|Phone      |AccountNumber|Rating|Billing Address       |Customer Priority|SLA | Description|
     |Bijay S     |01234567898| Ab12345     |Hot   |3 Lampton Road, TW31HY| Low             |Gold| Test      |
