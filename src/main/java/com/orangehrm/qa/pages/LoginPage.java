package com.orangehrm.qa.pages;
import com.orangehrm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Author:Nuwan Maduranga
 * Description:Here used Page Object Model framework concept and This class represents the login page and
 * contains methods to interact with its elements.
 *
 */
public class LoginPage extends TestBase {


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    //WebElements
    @FindBy(name = "username")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//button")
    WebElement btnLogin;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[1]/div/div[1]/img")
    WebElement companyLogo;

    //LoginPage Methods
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }
    public boolean validateCompanyLogo() throws InterruptedException {
        Thread.sleep(3000);
        return btnLogin.isDisplayed();
    }

    //When login to the system it will return HomePage
    public HomePage loginToSystem(String UserName, String Password){
        username.sendKeys(UserName);
        password.sendKeys(Password);
        btnLogin.click();
        return new HomePage();
    }


}
