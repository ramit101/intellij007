package com.conbnk.genericlib;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    public WebDriver driver;
    @BeforeClass
    public void configBC(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void configBM(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://selectorshub.com/xpath-practice-page/");
        //driver.get("https://www.saucedemo.com/");

        driver.get("https://aquabottesting.com/");
    }
    @AfterMethod
    public void configAM(){
        driver.close();

    }
    @AfterClass
    public void configAC(){

    }

}
