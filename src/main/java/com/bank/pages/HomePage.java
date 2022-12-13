package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement clickOnHomeButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement clickCustomerLogin;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement clickBankManagerLogin;

    public void setClickOnHomeButton(){
        Reporter.log("Click on Home Button" + clickOnHomeButton.toString());
        clickOnElement(clickOnHomeButton);
    }


    public void clickOnCustomerLogin() {
        Reporter.log("Click on Customer Login Button" + clickCustomerLogin.toString());
        clickOnElement(clickCustomerLogin);
    }

    public void clickOnBankManagerLogin() {
        Reporter.log("Click on Bank Manager Login Button" + clickBankManagerLogin.toString());
        clickOnElement(clickBankManagerLogin);
    }
}
