package com.conbnk.service;

import com.conbnk.genericlib.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SeleniumDemo extends BaseClass {

    @Test(enabled = false)
    public void compareDropdown(){
        WebElement webele = driver.findElement(By.xpath("//select[@id='first']"));
        Select select = new Select(webele);
        List<WebElement> dropdownelement = select.getOptions();
        ArrayList al= new ArrayList();
        for (WebElement ele:dropdownelement
             ) {
            al.add(ele.getText());
            System.out.println(ele.getText());
        }

        System.out.println("**************************");

        WebElement webel = driver.findElement(By.xpath("//select[@id='order-same']"));
        Select selec = new Select(webel);
        List<WebElement> dropdownelem = selec.getOptions();
        ArrayList al1= new ArrayList();
        for (WebElement ele:dropdownelem
        ) {
            al1.add(ele.getText());
            System.out.println(ele.getText());
        }
        try{
          //  al.equals(al1);
            Assert.assertEquals(al,al1);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test(enabled = false)
    public void alertPopUP(){
       driver.findElement(By.name("alert")).click();
       Alert al = driver.switchTo().alert();
       System.out.println(al.getText());
       al.getText();

    }

    @Test(enabled = false)
    public void loginPopUp() throws IOException {
        Runtime.getRuntime().exec("C:\\Users\\amit ranjan\\Desktop\\heroku.exe");
    }

    @Test(enabled = false)
    public void dropdown(){
        /*driver.findElement(By.xpath("//div[@class='qo']/div[1]/div[1]/div[1]/a[text()='Autocomplete']")).click();
      //  List<WebElement> webele = driver.findElement(By.id("Meal"));sendKeys("o");
       // webele.sendKeys("o");
       // Select select =new Select(webele);
       //List<WebElement> ls = select.getOptions();
      // for(WebElement web : ls){
        //   System.out.println(web.getText());*/
    }


}
