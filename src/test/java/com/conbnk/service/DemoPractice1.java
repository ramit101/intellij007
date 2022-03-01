package com.conbnk.service;
import java.util.*;
public class DemoPractice1 {
    public static void main(String [] args){
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
}
