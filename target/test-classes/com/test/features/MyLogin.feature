Feature: LoginPage
@Login

@regression
@links
Scenario:Validate All the links present in the FCRM page
Given I navigate to free CRM URL
Then I validate all the links are displayed in the FreeCRM Page
Then I Click on Login link on the Home Page
Then I Enter Valid User Name and Valid Password and Click On Login Button
Then I should be able to login to the Application Successfully


@validLogin
Scenario:Validate Login page with valid username and valid password
Given I navigate to free CRM URL
Then I Click on Login link on the Home Page
Then I Enter Valid User Name and Valid Password and Click On Login Button
Then I should be able to login to the Application Successfully

@invalidLogin
Scenario Outline:Validate Login page with Invalid userName<userName> and Invalid Password<password>
Given I navigate to free CRM URL
Then I Click on Login link on the Home Page
Then I Enter InValid UserName<userName> and InValid Password<password> and Click On Login Button
Then Invalid User Name and Password Message should be displayed
Examples:
|         userName             |        password         |
| mkmuralikrishna391@gmail.com |        test@123         |
|        test@gmail.com        |        14071991         |

@data
Scenario:Validate All the links present in the FCRM page
Given I navigate to free CRM URL
Then I validate all the Main links are displayed in the FreeCRM Page
     | Login | Sign Up | Pricing | Features | Customers |

@stringparameters
Scenario:Validate All the links present in the FCRM page
Given I navigate to free CRM URL
Then I validate all the page links "Login" and "Sign Up" and "Pricing" and "Features" and "Customers" are displayed in the FreeCRM Page








