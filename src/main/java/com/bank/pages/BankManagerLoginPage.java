package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {



    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement clickOnHomeButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement clickBankManagerLogin;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomer;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]")
    WebElement openAccount;


    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement customers;

    public void setClickOnHomeButton() {
        Reporter.log("Click on Home Button " + clickOnHomeButton.toString());
        clickOnElement(clickOnHomeButton);
    }


    public void clickOnBankManagerLogin() {
        Reporter.log("Click on Bank Manager Login Button" + clickBankManagerLogin.toString());
        clickOnElement(clickBankManagerLogin);
    }


    public void clickOnAddCustomer() {
        Reporter.log("Click on Add Customer Button" + addCustomer.toString());
        clickOnElement(addCustomer);
    }


    public void clickOnOpenAccount() {
        Reporter.log("Click on Open Account Button" + openAccount.toString());
        clickOnElement(openAccount);
    }


    public void clickOnCustomers() {
        Reporter.log("Click on Customers Button" + customers.toString());
        clickOnElement(customers);
    }

}
