package com.conbnk.service;

public class FibbonacaiSeries {
   static int n1 = 0;
   static int n2 = 1;
   static int n3 = 0;

    public static void calculateFiboSeries(int count){
       if(count>0) {
           n3 = n1 + n2;
           n1 = n2;
           n2 = n3;
           System.out.print(" "+n3);
           calculateFiboSeries(count-1);
       }
    }

    public static void main(String [] abc){
        int count = 15;
        System.out.print(n1 +" "+ n2);
        calculateFiboSeries(count-2);
    }
}
