package com.conbnk.service;

import java.util.Arrays;

public class BubbleSort {
    public static void main (String[] args){
        int [] arr = {10,77,25,99,20};
        int temp;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]>arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }
}
