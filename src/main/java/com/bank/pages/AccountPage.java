package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]")
    WebElement openAccount;

    @CacheLookup
    @FindBy(id = "//select[@id='userSelect']")
    WebElement customer;

    @CacheLookup
    @FindBy(id = "//select[@id='currency']")
    WebElement selectCurrency;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement process;

    //********************

    public void clickOnOpenAccount() {
        Reporter.log("Click on Open Account " + openAccount.toString());
        clickOnElement(openAccount);
    }


    public void setCustomer(String name) {
        Reporter.log("Select Customer name from DropDown");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='userSelect']"), name);
    }


    public void setCurrency(String currency) {
        Reporter.log("Select Currency from DropDown");
        selectByContainsTextFromDropDown(By.xpath("//select[@id='currency']"), currency);
    }


    public void setProcess() {
        Reporter.log("Click on Set Process " + process.toString());
        clickOnElement(process);
    }


}
