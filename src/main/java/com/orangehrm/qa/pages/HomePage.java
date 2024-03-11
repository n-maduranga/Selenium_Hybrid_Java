package com.orangehrm.qa.pages;

import com.orangehrm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends TestBase {

    //Page Elements
    public WebElement linkAdmin(){
        return driver.findElement(By.xpath("//span[text()='Admin']"));
    }
    public WebElement linkPIM(){
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
    }

    //Page Actions
    public UserManagementPage clickAdminLink(){
        linkAdmin().click();
        return new UserManagementPage();
    }

    public PIMPage clickPIMLink(){
        linkPIM().click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new PIMPage();
    }

}
