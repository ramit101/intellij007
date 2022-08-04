package com.conbnk.service;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPractice2 {
    @Test
    public void test1(){
        String str="tomorrow";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='o'){
              str.replace('o','#');
            }
            System.out.println(str);
        }

    }

    @Test
    public void splitStringWithoutInbuiltMethod(){
        String str = "amit ranjan";
        Scanner scr=new Scanner(str);
        while(scr.hasNext()){
            System.out.print(scr.next());
        }
    }
    @Test
    public void reverseArrayList(){
        List<Character> listb = new ArrayList();

        listb.add('a');
        listb.add('b');
        listb.add('z');
        listb.add('c');

        System.out.println(listb);
        for(int i=listb.size()-1; i>=0; i--){
           // System.out.println(listb.add(i,listb.size()-1));
        }
    }

    @Test
    public void compareTwoArray(){
        int [] a1 = {10,20,30,40};
        int [] a2 = {30,50,40,60};

        for(int i=0;i<a1.length; i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i] == a2[j]){
                    System.out.println(a1[i]);
                }
            }
        }
    }
}
