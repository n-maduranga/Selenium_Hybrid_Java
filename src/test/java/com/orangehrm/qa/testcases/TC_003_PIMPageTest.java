package com.orangehrm.qa.testcases;

import com.orangehrm.qa.base.TestBase;
import com.orangehrm.qa.pages.HomePage;
import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.pages.PIMPage;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_003_PIMPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    PIMPage pimPage ;
    Logger log = Logger.getLogger(TC_003_PIMPageTest.class);

    @BeforeMethod
    public void setup(){
        InitializeDriver();
        homePage = new HomePage();
        loginPage = new LoginPage();
        pimPage= new PIMPage();

        loginPage.loginToSystem("Admin","admin123");
    }

    @Test(priority = 1,description = "This test case will verify creating employee")
    public void verifyAddEmployee(){
        homePage.clickPIMLink();
        pimPage.addEmployee();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
