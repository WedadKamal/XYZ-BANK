package org.example.stepDefs;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.tests.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;


public class D02_loginStepDef extends BaseTest {

    public String actualResults;
    P02_login loginPageObj = new P02_login(driver);


    @When("Click Customer login")
    public void clickingOnCustomerLogin()
    {

        loginPageObj.clickCustomerLogin();

    }


    @And("Select name Albus Dumbledore")
    public void selectNameAlbusDumbledore()
    {

        loginPageObj.selectAlbusDom();

    }

    @And("Login")
    public void clickSecondLgnBtn()
    {

        loginPageObj.clickSecondLgnBtn();

    } @And("Make a deposit “1000”")
    public void deposit1000()
    {

        loginPageObj.deposite1000();

    }@And("Withdraw “400”")
    public void withdraw400()
    {

        loginPageObj.withdraw400();

    }@When("Click on Transaction")
    public void TransactionClicking()
    {

        loginPageObj.transactionClicking();

    }@Then("Assert on Balance = “600”")
    public void checkBalance()
    {

        actualResults= loginPageObj.getBalance();
        SoftAssert assertObj = new SoftAssert();

        assertObj.assertEquals(actualResults, "600",
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert in balance");
        assertObj.assertAll();

    }@Then("Assert on the transaction type of the withdraw")
    public void checkTransactionType()
    {


        actualResults=  loginPageObj.getWithdrawTransactionType();
        SoftAssert assertObj = new SoftAssert();

        assertObj.assertEquals(actualResults, "Debit",
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert in withdraw transaction type");
        assertObj.assertAll();


    }
}
