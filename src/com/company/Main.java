package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> mapDemo = new HashMap<>();
        mapDemo.put("Hello","Yeah");
        System.out.println(mapDemo.get("Hello"));

    }
}
