package com.orangehrm.qa.testcases;

import com.orangehrm.qa.base.TestBase;
import com.orangehrm.qa.pages.LoginPage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC001_LoginPageTest extends TestBase {

    LoginPage loginPage;
    Logger log = Logger.getLogger(TC001_LoginPageTest.class);

    @BeforeMethod
    public void setup(){
        InitializeDriver();
        loginPage= new LoginPage();
    }

    @Test(priority = 1,description = "This will verify company logo")
    public void testLoginPageLogo() throws InterruptedException {
        log.info("*********************** Starting 1st Test Case **************");
        boolean logo =loginPage.validateCompanyLogo();
        Assert.assertTrue(logo);
        log.info("*********************** Ending 1st Test Case **************");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
