package com.orangehrm.qa.pages;

import com.orangehrm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends TestBase {

    public WebElement linkAdmin(){
        return driver.findElement(By.xpath("//span[text()='Admin']"));
    }

    public UserManagementPage clickAdminLink(){
        linkAdmin().click();
        return new UserManagementPage();
    }

}
