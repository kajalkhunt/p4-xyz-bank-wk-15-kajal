package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement clickBankManagerLogin;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    WebElement openAccount;
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement process;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement clickOnHomeButton;

    public void clickOnBankManagerLogin() {
        Reporter.log("Click on Bank Manager Login Button " + clickBankManagerLogin.toString());
        clickOnElement(clickBankManagerLogin);
    }


    public void clickOnOpenAccount() {
        Reporter.log("Click on Open Account Button " + openAccount.toString());
        clickOnElement(openAccount);
    }


    public void serchCustomer(String fName, String lName) {
        Reporter.log("Search Customer : " + fName + " " + lName);
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='userSelect']"), fName + " " + lName);

    }

    public void setCurrency(String currency) {
        Reporter.log("Select Currency : " + currency);
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='currency']"), currency);

    }

    public void setProcess() {
        Reporter.log("Click on Process Button");
        clickOnElement(process);
    }

    public String getTextFromPopup() {
        Reporter.log("Get Text from Alert " + getTextFromAlert().toString());
        return getTextFromAlert();
    }

    public void acceptPopup() {
        Reporter.log("Accept Popup");
        acceptAlert();
    }

    public void setClickOnHomeButton() {
        Reporter.log("Click on Home Button" + clickOnHomeButton.toString());
        clickOnElement(clickOnHomeButton);
    }
}

















