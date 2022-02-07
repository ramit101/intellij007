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
    Number num;

    @Test
    public void test1() throws ParseException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals
                (driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html","Expected page loaded");

        List<WebElement> ele = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        ArrayList al=new ArrayList();

        for(WebElement element : ele){
          Locale locale = Locale.US;
          num = NumberFormat.getCurrencyInstance(locale).parse(element.getText());
          al.add(num);
        }
        System.out.println(Collections.max(al));
        System.out.println(Collections.min(al));
        System.out.println(al);
    }
}
