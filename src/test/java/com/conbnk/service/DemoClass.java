package com.conbnk.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DemoClass {
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("amitranjan");
        driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
    }

    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.airtel.in/bank/mobile-prepaid");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        List<WebElement> ele = driver.findElements(By.id("customer-number"));
        for(WebElement eleme : ele){
            if( eleme.getText().contains("airtel")){
                eleme.click();
            }
        }
    }

    @Test
    public void test3(){
        StringBuilder str=new StringBuilder("amit ranjan");
        str.replace(4,5,"");
        System.out.print(str);
    }

    @Test
    public void test31(){
        String str = "amit ranjan";
        String r="";
        Scanner sc = new Scanner(str);
        while(sc.hasNext()) {
            r = sc.next();
        }
        System.out.println(r);
    }
}
