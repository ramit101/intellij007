package com.conbnk.service;
import java.util.*;
public class DemoPractice1 {
    int no=25;
    String str2 = "Bihar";
    final String str = "amit";
    static String str1 = "olx";

    public static void main(String [] args){
        primeNo();
    }

    private void countDuplicateCharacters(){
        String str= "i am a test engineer";
        char [] ch = str.toCharArray();
        HashMap<Character,Integer> hm = new HashMap();

        for(char cha :ch){
            if(hm.containsKey(cha)){
                hm.put(cha,hm.get(cha)+1);
            }else{
                hm.put(cha,1);
            }
        }
        Set<Character> chu=hm.keySet();
        for(char cha : chu){
            if(hm.get(cha)>1){
                System.out.print(cha);
            }
        }
    }
    public static void primeNo(){
        int n=20;
        for(int i=1; i<=n; i++){
           if(i%1==0 && i%n==0){
              System.out.print(i+" ");
           }
        }
    }

    public static final void test1(){
        System.out.println("this is DemoPrac1");
    }

}
