package com.conbnk.fc;

import java.util.HashMap;

public class CountCharacters {

    public static void main(String [] args){
        String inputString = "aabbbcccdddrrrj";
        char [] charArray = inputString.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();

        for(char ch:charArray){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        System.out.println(hm);
    }
}
