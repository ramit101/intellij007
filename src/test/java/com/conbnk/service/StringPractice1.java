package com.conbnk.service;

public class StringPractice1 {
    public static void main(String [] args){
        String str = "Happy New Year";
        String [] arr = str.split(" ");
        String temp="";

        for(int i=0;i<arr.length;i++){
            temp=arr[0];
            arr[0]=arr[arr.length-1];
            arr[arr.length-1]=temp;

        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
