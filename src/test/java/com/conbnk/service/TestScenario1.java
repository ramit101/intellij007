package com.conbnk.service;

import com.conbnk.genericlib.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.*;

import static java.util.Collections.sort;

public class TestScenario1 extends BaseClass {
  
    @Test
    public void test1(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals
                (driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");

        List<WebElement> ele = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        ArrayList al=new ArrayList();   

        for(WebElement element : ele){
            String [] str = element.getText().split("$");
            System.out.println(str.toString());
        }
        System.out.println("********");
    }
}
