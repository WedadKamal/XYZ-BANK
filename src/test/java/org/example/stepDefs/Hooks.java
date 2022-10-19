package org.example.stepDefs;
// your code inside the class will be like this
import com.fawry.TicketsMall.angularAutomation.tests.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {


    String url="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login" ;
    String browserType = "Chrome";
    @Before
    public void  userOpenBrowser(){

        loadConfiguration(url,browserType);
    }

    @After
    public void  closeTheBrowser() throws InterruptedException {
        closeDriver();
    }

}
