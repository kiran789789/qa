package com.test.Pages;

import com.test.BaseClass.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetails  extends TestBase {


          public PaymentDetails()
          {
              PageFactory.initElements(webdriver, this);
          }

    @FindBy(xpath = "//*[contains(text(),'Amount*')]/parent::div/div/input[@name='amount']")
    public WebElement Amount;

    @FindBy(xpath = "//*[@name='fullName']")
    public WebElement fullName;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@placeholder='Phone Number']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@type='button']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id='walletlang']")
    public WebElement wallet;

    @FindBy(xpath = "//*[@id='OMISE-OMISE_PAYNOW']")
    public WebElement payNow;

    @FindBy(xpath = "//*[@id='PayNowButtonWeb']")
    public WebElement payNowButton;


    public void SelectPaymentMethodAndPay() throws InterruptedException {

        wallet.click();
        payNow.click();
        Thread.sleep(2000);
        payNowButton.click();
        Thread.sleep(5000);

    }






    public void enterTheDataInPaymentsPage()  {

        fullName.sendKeys("Kiran");
        email.sendKeys("Kiran@gmail.com");
        phoneNumber.sendKeys("23232323");
        submitButton.click();

    }


    public void validateAmountButton(){

      boolean status =  Amount.isEnabled();

       if(status == false)
       {
           System.out.println("Amount field is disabled");
       }

       else

       {
           System.out.println("Amount field is Enabled");

       }

    }












}
