Feature: Contacts Page

@Contacts
Scenario: Validate Contacts Page
Given I navigate to free CRM URL
Then  I Login Into the Application with Valid Credentials
Then  I hover the mouse on the Contacts Icon and Click on Plus Button
Then  I Enter the Data in Contacts Page and Save the Contacts page
Then  I Validate the Contact Details are Created Successfully