Feature: Payment Details Page

@Payments
Scenario: Validate payment Details page
Given I navigate to Payment Details Page URL
Then  I Validate Amount field
Then  I Enter the Data in Payment Details Page and submit the page
Then  I validate checkout page with title
Then  I select I select payment option and click pay button
Then  I validate CHAIPort QRCode Checkout page with title