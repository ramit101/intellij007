package com.conbnk.service;

import org.testng.annotations.Test;

public class ReverseString {

    @Test
    public void test1(){
      String str = "";

      char [] cha = str.toCharArray();
      for(int i=cha.length-1;i>=0;i--){
         System.out.print(cha[i]+" ");
      }

      for(int i = str.length()-1; i>=0 ;i--){
          System.out.print(str.charAt(i));
      }
    }
}
