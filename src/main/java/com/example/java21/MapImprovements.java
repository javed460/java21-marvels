package com.example.java21;

import java.util.LinkedHashMap;

public class MapImprovements {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> colorCodeMap = new LinkedHashMap<>();
        colorCodeMap.put("RED",1);

        System.out.println(colorCodeMap);

        colorCodeMap.putFirst("GREEN", 2); // LinkedHashMap new method putFirst
        System.out.println(colorCodeMap);

        colorCodeMap.putLast("BLACK", 3); // LinkedHashMap new method putLast
        System.out.println(colorCodeMap);

        System.out.println(colorCodeMap.firstEntry()); // LinkedHashMap new method firstEntry
        System.out.println(colorCodeMap.lastEntry()); // LinkedHashMap new method lastEntry
        System.out.println(colorCodeMap.reversed()); // LinkedHashMap new method reversed
    }
}
