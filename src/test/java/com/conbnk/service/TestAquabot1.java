package com.conbnk.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAquabot1 {
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://aquabottesting.com/dropdowns.html");
        WebElement wele = driver.findElement(By.xpath("//button[@class='hdropbtn']"));
        System.out.println(wele.getText());
    }
}
