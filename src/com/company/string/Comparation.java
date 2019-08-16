package com.company.string;

import java.util.Date;

public class Comparation {

    public static void main(String[] args) {
        long a = new Date().getTime();
        String string = "";
        int n = 20000;
        for (int i = 0; i < n; i++) {
            string += "." + i;
        }
        System.out.println("String used time " + (System.currentTimeMillis() - a) / 1000.0 + "s");
        long s1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("." + i);
        }
        System.out.println("StringBuilder used time " + (System.currentTimeMillis() - s1) / 1000.0 + "s");
        long s2 = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("." + i);
        }
        System.out.println("StringBuffer used time " + (System.currentTimeMillis() - s2) / 1000.0 + "s");
    }
}