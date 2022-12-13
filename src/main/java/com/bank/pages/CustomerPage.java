package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement clickOnHomeButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement clickBankManagerLogin;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement clickCustomers;


    public void setClickOnHomeButton() {
        Reporter.log("Click on Home Button" + clickOnHomeButton.toString());
        clickOnElement(clickOnHomeButton);
    }


    public void clickOnBankManagerLogin() {
        Reporter.log("Click on Bank Manager Login Button" + clickBankManagerLogin.toString());
        clickOnElement(clickBankManagerLogin);
    }

    public void clickOnOpenAccount() {
        Reporter.log("Click on Open Account Button" + clickCustomers.toString());
        clickOnElement(clickCustomers);
    }

}
