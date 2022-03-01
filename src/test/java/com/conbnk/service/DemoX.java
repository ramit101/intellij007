package com.conbnk.service;

public class DemoX {

    public static void main(String[] args) {

        String[] circle = {"Delhi", "Bihar", "Up", "patna"};

        for (int i = 0; i < circle.length; i++) {
            if (circle[i] == "patna") {
                System.out.print(i);
            }
        }

    }
}
