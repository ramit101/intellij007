package com.conbnk.genericlib;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    @BeforeClass
    public void configBC(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void configBM(){
        driver = new ChromeDriver();
        //driver.get("https://selectorshub.com/xpath-practice-page/");
       // driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get("https://chercher.tech/practice/popups#");
      //  driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.get("https://demo.aspnetawesome.com/");

    }
    @AfterMethod
    public void configAM(){
     //   driver.close();

    }
    @AfterClass
    public void configAC(){

    }

}
