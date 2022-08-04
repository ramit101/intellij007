package com.conbnk.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class SeleniumPrac11 {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://aquabottesting.com/index.html");
       // driver.findElement(By.id("new-window-btn")).click();

        /*for (String window:win) {
            driver.switchTo().window(window);
            if(driver.getCurrentUrl().equalsIgnoreCase("https://aquabottesting.com/new-window.html")) {
                driver.findElement(By.xpath("//a[text()='CLOSE']")).click();
                System.out.println("Expected window is closed");
            }
            else{
                System.out.println("Expected window is not found");
            }
        }*/
       String color= driver.findElement(By.id("alert-btn")).getCssValue("color");
        System.out.println(color);

    }
}
