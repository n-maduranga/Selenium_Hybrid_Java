package com.orangehrm.qa.testcases;

import com.orangehrm.qa.base.TestBase;
import com.orangehrm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC001_LoginPageTest extends TestBase {

    LoginPage loginPage;

    @BeforeMethod
    public void setup(){
        InitializeDriver();
        loginPage= new LoginPage();
    }

    @Test(priority = 1,description = "This will verify company logo")
    public void testLoginPageLogo() throws InterruptedException {
        boolean logo =loginPage.validateCompanyLogo();
        Assert.assertTrue(logo);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
