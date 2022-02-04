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
   // String [] str;
    @Test
    public void test1(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals
                (driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html","Expected page loaded");

        List<WebElement> ele = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        ArrayList al=new ArrayList();
      // TreeSet al = new TreeSet();
      // LinkedList al = new LinkedList();

        for(WebElement element : ele){
            String [] str = element.getText().split("$");
            System.out.println(str.toString());

         //  al.add(element.getText().split("$")) ;
        }
      //  Collections.sort(al);
    }
}