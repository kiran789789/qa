package com.test.glueCode;


import com.test.BaseClass.TestBase;

import com.test.Pages.*;
import com.test.Utils.CommonFunctions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;




public class GlueCode  extends TestBase {



	public PaymentDetails paymentDetails;


	@Before
	public void LaunchBrowser() throws Exception {

		TestBase.initialization();
		paymentDetails = new PaymentDetails();
		WebDriverWait webdriverwait;
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@After
	public void Hide() throws Exception {

		TestBase.CloseBrowser();
	}

	@Given("I navigate to Payment Details Page URL")
	public void i_navigate_to_payment_details_page_url() throws InterruptedException {

		webdriver.get(CommonFunctions.getPaymentPageURL());
		Thread.sleep(3000);
	}
	@Then("I Validate Amount field")
	public void i_validate_amount_field() {

		paymentDetails.validateAmountButton();
	}
	@Then("I Enter the Data in Payment Details Page and submit the page")
	public void i_enter_the_data_in_payment_details_page_and_submit_the_page() throws InterruptedException {

		paymentDetails.enterTheDataInPaymentsPage();
		Thread.sleep(5000);

	}

	@Then("I validate checkout page with title")
	public void i_validate_checkout_page_with_title() throws InterruptedException {
		Thread.sleep(5000);
		String TitleName = webdriver.getTitle();
		System.out.println(TitleName);
		Assert.assertEquals(TitleName, "Cart" );

	}
	@Then("I select I select payment option and click pay button")
	public void i_select_i_select_payment_option_and_click_pay_button() throws InterruptedException {

		paymentDetails.SelectPaymentMethodAndPay();

	}

	@Then("I validate CHAIPort QRCode Checkout page with title")
	public void i_validate_chai_port_qr_code_checkout_page_with_title() throws InterruptedException {

		Thread.sleep(5000);
		String TitleName = webdriver.getTitle();
		System.out.println(TitleName);
		Assert.assertEquals(TitleName, "CHAIPort QRCode Checkout" );

	}



}

