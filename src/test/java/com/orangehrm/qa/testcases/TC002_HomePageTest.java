package com.orangehrm.qa.testcases;

import com.orangehrm.qa.base.TestBase;
import com.orangehrm.qa.pages.HomePage;
import com.orangehrm.qa.pages.LoginPage;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC002_HomePageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    Logger log = Logger.getLogger(TC002_HomePageTest.class);

    @BeforeMethod
    public void setup(){
        InitializeDriver();
        homePage = new HomePage();
        loginPage = new LoginPage();
        loginPage.verifyloginToSystem("Admin","admin123");
    }
    @Test(priority = 1,description = "This will test navigating to Usermanagement page")
    public void verifynavigateUserManagement(){
        log.info("*********************** Starting 1st Test Case Of HomePage **************");
        homePage.clickAdminLink();
        log.info("*********************** Ending 1st Test Case Of HomePage **************");

    }

}
