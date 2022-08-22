package com.test.Utils;

import com.test.BaseClass.TestBase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.test.BaseClass.TestBase.webdriver;

public class CommonFunctions {




    private static final String paymentPageURL = "https://www.stage-page.chaiport.io/2AZX3ENuQMlYlNBlXfr7dcI5ngS";





    public static String getPaymentPageURL(){

        return paymentPageURL;
    }






}
