package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement clickCustomerLogin;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement clickCustomerLogin1;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement clickCustomerLogin2;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement clickOnLoginButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement clickOnLoginButton1;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement clickOnLoginButton2;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement clickOnLogoutButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement clickOnDepositTab;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement clickOnDepositTab1;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterAmount;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnDepositButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement clickOnWithdrawlTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enterAmount1;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnWithdrawlButton;


    public void clickOnCustomerLogin() {
        Reporter.log("Click on Customer Login Button " + clickCustomerLogin.toString());
        clickOnElement(clickCustomerLogin);
    }

    public void serchName(String fName, String lName) {
        Reporter.log("Select Customer from dropdown menu");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='userSelect']"), fName + " " + lName);
    }

    public void clickOnCustomerLogin2() {
        Reporter.log("Click on Customer Login Button " + clickCustomerLogin.toString());
        clickOnElement(clickCustomerLogin2);
    }


    public String exptectedTextMessage(String expected) {
        Reporter.log("To Verify Message  " + expected.toString());
        System.out.println("Expected Text or Message is : " + expected);
        return expected;
    }

    public void clickOnCustomerLogin1() {
        Reporter.log("Click on Customer Login Button " + clickCustomerLogin.toString());
        clickOnElement(clickCustomerLogin1);
    }

    public String actualTextToVerify(By by) {
        String actual = driver.findElement(by).getText();
        System.out.println("Actual Text or Message is : " + actual);
        Reporter.log("To obtain actual Message  " + actual.toString());
        return actual;
    }


    public void login() {
        Reporter.log("Click on Login Button " + clickOnLoginButton.toString());
        clickOnElement(clickOnLoginButton);
    }

    public void login1() {
        Reporter.log("Click on Login Button " + clickOnLoginButton.toString());
        clickOnElement(clickOnLoginButton1);
    }

    public void login2() {
        Reporter.log("Click on Login Button " + clickOnLoginButton.toString());
        clickOnElement(clickOnLoginButton2);
    }

    public void verifyLogoutButton() {
        Reporter.log("To Verify Logout Button ");
        Boolean result = driver.findElement(By.xpath("//button[normalize-space()='Logout']")).isDisplayed();
    }


    public void logout() {
        Reporter.log("Click on Logout Button" + clickOnLogoutButton.toString());
        clickOnElement(clickOnLogoutButton);
    }


    public void DepositTab() {
        Reporter.log("Click on Deposit Tab" + clickOnDepositTab.toString());
        clickOnElement(clickOnDepositTab);
    }

    public void DepositTab1() {
        Reporter.log("Click on Deposit Tab" + clickOnDepositTab.toString());
        clickOnElement(clickOnDepositTab1);
    }

    public void Amount() {
        Reporter.log("Enter 100 Amount to Amount Field" + enterAmount.toString());
        sendTextToElement(enterAmount, "100");
    }

    public void DepositButton() {
        Reporter.log("Click on Deposit Button" + clickOnDepositButton.toString());
        clickOnElement(clickOnDepositButton);
    }


    public void WithdrawlTab() {
        Reporter.log("Click on Withdrawl Tab" + clickOnWithdrawlTab.toString());
        clickOnElement(clickOnWithdrawlTab);
    }


    public void Amount1() {
        Reporter.log("Enter 50 Amount to Amount Field" + enterAmount1.toString());
        sendTextToElement(enterAmount1, "50");
    }


    public void WithdrawlButton() {
        Reporter.log("Click on Withdrawl Button" + clickOnWithdrawlButton.toString());
        clickOnElement(clickOnWithdrawlButton);
    }

}
