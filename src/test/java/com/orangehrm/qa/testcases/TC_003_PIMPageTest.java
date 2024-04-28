package com.orangehrm.qa.testcases;

import com.orangehrm.qa.base.TestBase;
import com.orangehrm.qa.pages.HomePage;
import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.pages.PIMPage;
import com.orangehrm.qa.utils.Utility;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_003_PIMPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    PIMPage pimPage ;
    Logger log = Logger.getLogger(TC_003_PIMPageTest.class);
    String sheetname = "contacts";

    @BeforeMethod
    public void setup(){
        InitializeDriver();
        homePage = new HomePage();
        loginPage = new LoginPage();
        pimPage= new PIMPage();

        loginPage.verifyloginToSystem("Admin","admin123");
    }

    //Read data from excel file
    @DataProvider
    public  Object[][] getOrangeHRMData(){
        Object[][] testdata= Utility.getTestData(sheetname);
        return  testdata;

    }

    @Test(priority = 1,description = "This test case will verify creating employee",dataProvider = "getOrangeHRMData")
    public void verifyAddEmployee(String firstname,String middlename,String lastname){
        homePage.clickPIMLink();
        pimPage.addEmployee(firstname,middlename,lastname);
        log.info("Successfuly Added Employee");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
