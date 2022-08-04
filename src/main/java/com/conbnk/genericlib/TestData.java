package com.conbnk.genericlib;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "booking data")
    public Object[][] bookingData(){
      return new Object [][]{
                {"lakshya","sarma",1000,true,"2018-01-01","2019-01-01","dinner"}
        };
    }

}
