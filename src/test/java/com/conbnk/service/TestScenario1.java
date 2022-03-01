package com.conbnk.service;

import com.conbnk.genericlib.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.*;

import static java.util.Collections.sort;

public class TestScenario1 extends BaseClass {
    @Test
    public void test1()  {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals
                (driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html","Expected page loaded");

        List<WebElement> ele = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        ArrayList al=new ArrayList();
        double pricedouble = 0.0d;

        for(WebElement element : ele){
           Double price = Double.parseDouble(element.getText().trim().replace("$",""));
           al.add(price);

            if(pricedouble < price){
              pricedouble = price;
            }
        }
        System.out.println(Collections.max(al));
        System.out.println(Collections.min(al));
        System.out.println(al);
        System.out.println(pricedouble);
        driver.findElement(By.xpath("//div[text()='"+ pricedouble +"']")).click();
    }
}
