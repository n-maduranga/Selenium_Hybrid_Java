package com.orangehrm.qa.pages;

import com.orangehrm.qa.base.TestBase;
import org.openqa.selenium.By;

public class PIMPage extends TestBase {

    //Page elements
    By btnAdd = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    By fname = By.name("firstName");
    By mname = By.name("middleName");
    By lname = By.name("lastName");
    By empID = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");
    By btnSave = By.xpath("//button[@type='submit']");
    By linkEmpList = By.xpath("//a[contains(text(),'Employee List')]");

    //Actions
    public void addEmployee(String Fname,String Mname,String Lname)  {
        driver.findElement(btnAdd).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(fname).sendKeys(Fname);
        driver.findElement(mname).sendKeys(Mname);
        driver.findElement(lname).sendKeys(Lname);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(btnSave).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(linkEmpList).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
