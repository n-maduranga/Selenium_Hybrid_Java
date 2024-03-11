package com.orangehrm.qa.pages;

import com.orangehrm.qa.base.TestBase;
import org.openqa.selenium.By;

public class PIMPage extends TestBase {

    //Page elements
    By btnAdd = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    By fname = By.name("firstname");
    By mname = By.name("middleName");
    By lname = By.name("lastName");
    By empID = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");
    By btnSave = By.xpath("//button[@type='submit']");

    //Actions
    public void addEmployee()  {
        driver.findElement(btnAdd).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
