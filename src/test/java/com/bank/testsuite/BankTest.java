package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    CustomerLoginPage customerLoginPage;
    OpenAccountPage openAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();

    }


    String fName = "James";
    String lName = "Bond";
    String pCode = "HA88BQ";

    @Test(groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterFirstName(fName);
        addCustomerPage.enterLastName(lName);
        addCustomerPage.enterPostCode(pCode);
        addCustomerPage.clickOnAddCustomerButton();
        Assert.assertEquals(addCustomerPage.getTextFromPopup().substring(0, 27), "Customer added successfully", "Message not displayed");
        addCustomerPage.acceptPopup();
        homePage.setClickOnHomeButton();

    }

    @Test(groups = {"sanity","regression"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterFirstName(fName);
        addCustomerPage.enterLastName(lName);
        addCustomerPage.enterPostCode(pCode);
        addCustomerPage.clickOnAddCustomerButton();
        Assert.assertEquals(addCustomerPage.getTextFromPopup().substring(0, 27), "Customer added successfully", "Message not displayed");
        addCustomerPage.acceptPopup();
        homePage.setClickOnHomeButton();
        driver.navigate().refresh();
        openAccountPage.clickOnBankManagerLogin();
        Thread.sleep(2000);
        openAccountPage.clickOnOpenAccount();
        openAccountPage.serchCustomer(fName, lName);
        openAccountPage.setCurrency("Pound");
        openAccountPage.setProcess();
        Assert.assertEquals(addCustomerPage.getTextFromPopup().substring(0, 28), "Account created successfully", "Not match");
        openAccountPage.acceptPopup();
        openAccountPage.setClickOnHomeButton();
    }

    @Test(groups = {"smoke","regression"})
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterFirstName(fName);
        addCustomerPage.enterLastName(lName);
        addCustomerPage.enterPostCode(pCode);
        addCustomerPage.clickOnAddCustomerButton();
        Assert.assertEquals(addCustomerPage.getTextFromPopup().substring(0, 27), "Customer added successfully", "Message not displayed");
        addCustomerPage.acceptPopup();
        homePage.setClickOnHomeButton();
        driver.navigate().refresh();
        openAccountPage.clickOnBankManagerLogin();
        Thread.sleep(2000);
        openAccountPage.clickOnOpenAccount();
        openAccountPage.serchCustomer(fName, lName);
        openAccountPage.setCurrency("Pound");
        openAccountPage.setProcess();
        Assert.assertEquals(addCustomerPage.getTextFromPopup().substring(0, 28), "Account created successfully", "Not match");
        openAccountPage.acceptPopup();
        openAccountPage.setClickOnHomeButton();

        customerLoginPage.clickOnCustomerLogin();
        customerLoginPage.serchName(fName, lName);
        customerLoginPage.login();
        customerLoginPage.verifyLogoutButton();
        customerLoginPage.logout();
        assertAssert("Logout Is Not Successful", customerLoginPage.exptectedTextMessage("Your Name"), customerLoginPage.actualTextToVerify(By.xpath("//label[contains(text(),'Your Name :')]")).substring(0, 9));
        openAccountPage.setClickOnHomeButton();
    }

    @Test(groups = {"smoke","regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterFirstName(fName);
        addCustomerPage.enterLastName(lName);
        addCustomerPage.enterPostCode(pCode);
        addCustomerPage.clickOnAddCustomerButton();
        Assert.assertEquals(addCustomerPage.getTextFromPopup().substring(0, 27), "Customer added successfully", "Message not displayed");
        addCustomerPage.acceptPopup();
        homePage.setClickOnHomeButton();
        driver.navigate().refresh();
        openAccountPage.clickOnBankManagerLogin();
        Thread.sleep(2000);
        openAccountPage.clickOnOpenAccount();
        openAccountPage.serchCustomer(fName, lName);
        openAccountPage.setCurrency("Pound");
        openAccountPage.setProcess();
        Assert.assertEquals(addCustomerPage.getTextFromPopup().substring(0, 28), "Account created successfully", "Not match");
        openAccountPage.acceptPopup();
        openAccountPage.setClickOnHomeButton();

        customerLoginPage.clickOnCustomerLogin();
        customerLoginPage.serchName(fName, lName);
        customerLoginPage.login();
        customerLoginPage.verifyLogoutButton();
        customerLoginPage.logout();
        assertAssert("Logout Is Not Successful", customerLoginPage.exptectedTextMessage("Your Name"), customerLoginPage.actualTextToVerify(By.xpath("//label[contains(text(),'Your Name :')]")).substring(0, 9));
        openAccountPage.setClickOnHomeButton();
        Thread.sleep(2000);
        driver.navigate().refresh();

        customerLoginPage.clickOnCustomerLogin1();
        customerLoginPage.serchName(fName, lName);
        customerLoginPage.login1();
        customerLoginPage.DepositTab();
        customerLoginPage.Amount();
        customerLoginPage.DepositButton();
        assertAssert("Deposit Is Not Successful", customerLoginPage.exptectedTextMessage("Deposit Successful"), customerLoginPage.actualTextToVerify(By.xpath("//span[contains(text(),'Deposit Successful')]")));
        // openAccountPage.setClickOnHomeButton();
    }

    @Test(groups = "regression")
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterFirstName(fName);
        addCustomerPage.enterLastName(lName);
        addCustomerPage.enterPostCode(pCode);
        addCustomerPage.clickOnAddCustomerButton();
        Assert.assertEquals(addCustomerPage.getTextFromPopup().substring(0, 27), "Customer added successfully", "Message not displayed");
        addCustomerPage.acceptPopup();
        homePage.setClickOnHomeButton();
        driver.navigate().refresh();
        openAccountPage.clickOnBankManagerLogin();
        Thread.sleep(2000);
        openAccountPage.clickOnOpenAccount();
        openAccountPage.serchCustomer(fName, lName);
        openAccountPage.setCurrency("Pound");
        openAccountPage.setProcess();
        Assert.assertEquals(addCustomerPage.getTextFromPopup().substring(0, 28), "Account created successfully", "Not match");
        openAccountPage.acceptPopup();
        openAccountPage.setClickOnHomeButton();

        customerLoginPage.clickOnCustomerLogin();
        customerLoginPage.serchName(fName, lName);
        customerLoginPage.login();
        customerLoginPage.verifyLogoutButton();
        customerLoginPage.logout();
        assertAssert("Logout Is Not Successful", customerLoginPage.exptectedTextMessage("Your Name"), customerLoginPage.actualTextToVerify(By.xpath("//label[contains(text(),'Your Name :')]")).substring(0, 9));
        openAccountPage.setClickOnHomeButton();
        Thread.sleep(2000);
        driver.navigate().refresh();

        customerLoginPage.clickOnCustomerLogin1();
        customerLoginPage.serchName(fName, lName);
        customerLoginPage.login1();
        customerLoginPage.DepositTab();
        customerLoginPage.Amount();
        customerLoginPage.DepositButton();
        assertAssert("Deposit Is Not Successful", customerLoginPage.exptectedTextMessage("Deposit Successful"), customerLoginPage.actualTextToVerify(By.xpath("//span[contains(text(),'Deposit Successful')]")));
        bankManagerLoginPage.setClickOnHomeButton();
        Thread.sleep(5000);
        driver.navigate().refresh();
        customerLoginPage.clickOnCustomerLogin2();
        customerLoginPage.serchName(fName, lName);
        Thread.sleep(1000);
        customerLoginPage.login2();
        customerLoginPage.WithdrawlTab();
        Thread.sleep(3000);
        customerLoginPage.Amount1();
        customerLoginPage.WithdrawlButton();
        assertAssert("Transaction Is Not Successful", customerLoginPage.exptectedTextMessage("Transaction successful"), customerLoginPage.actualTextToVerify(By.xpath("//span[contains(text(),'Transaction successful')]")));
    }

}

