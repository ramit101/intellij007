package com.newAutom.practice;

import com.conbnk.genericlib.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AquaBotTesting extends BaseClass {

    //scenario- 1 to verify that button changeText is clicked or not.
    @Test(invocationCount = 3)
    public void scenario1() throws InterruptedException {
        driver.findElement(By.xpath("//a[text() = 'Buttons & Links']")).click();
        Thread.sleep(2000);
        WebElement but1 = driver.findElement(By.id("text-change"));
        but1.click();
        Thread.sleep(2000);
        if(but1.getAttribute("value").equalsIgnoreCase("BUTTON CLICKED")){
            System.out.println("button is clicked");
        }
        else{
            System.out.println("button is not clicked");
        }
    }



}
