package com.company.string;

public class Comparation {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "de";
        long startTime = System.nanoTime();
        String str = str1 + str2;
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime + " nano seconds");
        StringBuilder stringBuilder1 = new StringBuilder("abc");
        StringBuilder stringBuilder2 = new StringBuilder("de");
        startTime = System.nanoTime();
        StringBuilder stringBuilder = stringBuilder1.append(stringBuilder2);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime + " nano seconds");
    }
}