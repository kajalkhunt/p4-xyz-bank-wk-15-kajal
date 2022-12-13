package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    //Enter Last Name
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    //enter PostCode
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;

    //click On "Add Customer" Button
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickAddCust;



//********************************

    public void enterFirstName(String name) {
        Reporter.log("Send First Name " + firstName + " To First Name Field" + firstName.toString());
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String surnamename) {
        Reporter.log("Send Last Name " + lastName + " To Last Name Field" + lastName.toString());

        sendTextToElement(lastName, surnamename);
    }

    public void enterPostCode(String pin) {
        Reporter.log("Send Postcode" + postCode + " To Postcode Field" + postCode.toString());
        sendTextToElement(postCode, pin);
    }

    public void clickOnAddCustomerButton() {
        Reporter.log("Click on Add Customer Button " + clickAddCust.toString());
        clickOnElement(clickAddCust);
    }

    public String getTextFromPopup() {
        Reporter.log("Get Text From Popup : " + getTextFromAlert().toString());
        return getTextFromAlert();
    }

    public void acceptPopup() {
        Reporter.log("Accept Popup");
        acceptAlert();
    }

}
