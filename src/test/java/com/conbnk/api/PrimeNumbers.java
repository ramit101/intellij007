package com.conbnk.api;

public class PrimeNumbers {
    public static void main(String[] args){
        int n1 =100;
      //  int n2 = 200;
        for(int i =1;i<=100;i++){
            if(n1%1==0 && n1%n1==0){
                System.out.println(n1 + " is prime no");
                n1=n1+1;
            }
        }
    }
}
