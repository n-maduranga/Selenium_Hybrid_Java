package com.orangehrm.qa.base;
import com.orangehrm.qa.utils.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Utility util;


    //Here driver will be initialized. Browser name will be taken from property file
    public static void InitializeDriver(){
        //readConfigPropertyFile();
        String browserName = readConfigPropertyFile().getProperty("browser");

        switch (browserName){
            case "chrome":
                System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver.exe");
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(util.ImplicitWait, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(util.PageLoadTimeout,TimeUnit.SECONDS);
        driver.get(readConfigPropertyFile().getProperty("Weburl"));

    }

    //Read the property file
    public static Properties readConfigPropertyFile()  {
        try {
            Properties prop = new Properties();
            FileInputStream file = new FileInputStream("C:\\Users\\JRC Software\\IdeaProjects\\Selenium_Hybrid_Java\\src\\main\\java\\com\\orangehrm\\qa\\config\\config.properties");
            prop.load(file);
            return prop;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }





}
