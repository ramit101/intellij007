package com.conbnk.service;

import org.testng.annotations.Test;

public class DemoX extends DemoPractice1{
    String str2="patna";
    static String str1 = "ola";

    public static void main(String[] args){
        System.out.println(DemoPractice1.str1);
        System.out.println(str1);

    }

    public void test2(){

    }

    @Test
    public void main(){
        System.out.println(str2);
        System.out.println(DemoPractice1.str1);
        System.out.println(str1);
    }

}
