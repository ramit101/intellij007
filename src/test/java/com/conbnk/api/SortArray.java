package com.conbnk.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SortArray {
    public static void main(String [] args){
        String [] str={"Amit","Ranjan","Yash","freecharge"};
       // ArrayList<Character> al=new ArrayList();
        TreeSet<Character> ts = new TreeSet();
        for(int i=0;i<str.length;i++){
            ts.add(str[i].charAt(2));
        }
        for(Character ch: ts){
            System.out.println(ch);
        }

    }
}
