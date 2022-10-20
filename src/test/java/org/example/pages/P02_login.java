package org.example.pages;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.pages.MainPage;
import com.fawry.TicketsMall.angularAutomation.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P02_login extends MainPage {
    public P02_login(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath="//button[text()='Customer Login']")
    WebElement customerLgnBtn;

    @FindBy(id="userSelect")
    WebElement userSelect;

    @FindBy(xpath="//option[text()='Albus Dumbledore']")
    WebElement albusDumOption;

 @FindBy(xpath="//button[text()='Login']")
    WebElement secondLgnBtn;

 @FindBy(xpath="//button[@ng-click='deposit()']")
    WebElement depositeSelect;

 @FindBy(xpath="//input[@placeholder='amount']")
    WebElement amount;

 @FindBy(xpath="//form[@ng-submit='withdrawl()']//input[@placeholder='amount']")
    WebElement withdrawAmount;

 @FindBy(xpath="//button[@ng-click='withdrawl()']")
    WebElement withdrawSelect;

 @FindBy(xpath="//button[@type='submit']")
    WebElement Submit;

 @FindBy(xpath="//button[@ng-click='transactions()']")
    WebElement transactionSelect;

 @FindBy(xpath="//strong[@class='ng-binding'][2]")
    WebElement getBalance;

 @FindBy(xpath="//td[@class='ng-binding'][3]")
 List<WebElement> withdrawTransactionType;


    public void clickCustomerLogin() {
        try {


            scrollIntoViewAndClick(customerLgnBtn);

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }
    }
    public void selectAlbusDom() {
        try {


            userSelect.click();
            Thread.sleep(1000);
            albusDumOption.click();

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }
    }
    public void clickSecondLgnBtn() {
        try {


            scrollIntoViewAndClick(secondLgnBtn);

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }
    }
    public void deposite1000() {
        try {


            scrollIntoViewAndClick(depositeSelect);
            setTextValue(amount,"1000");
            scrollIntoViewAndClick(Submit);

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }
    }
    public void withdraw400() {
        try {


            scrollIntoViewAndClick(withdrawSelect);
            setTextValue(withdrawAmount,"400");
            scrollIntoViewAndClick(Submit);
            Thread.sleep(1000);
        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }
    }
    public void transactionClicking() {
        try {


            scrollIntoViewAndClick(transactionSelect);

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }
    }
    public String getBalance() {
        String balance;
        try {


            balance= getBalance.getText();

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

            return GeneralConstants.FAILED;
        }
        return balance;
    }
    public String getWithdrawTransactionType() {
        String WithdrawTransactionType;
        try {


            WithdrawTransactionType= withdrawTransactionType.get(1).getText();

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

            return GeneralConstants.FAILED;
        }
        return WithdrawTransactionType;
    }

}
