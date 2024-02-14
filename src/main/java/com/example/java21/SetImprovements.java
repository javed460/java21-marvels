package com.example.java21;

import java.util.LinkedHashSet;

public class SetImprovements {

    public static void main(String[] args) {
        LinkedHashSet<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(2);
        integerSet.add(3);

        System.out.println(integerSet.reversed()); // LinkedHashSet new method reversed
    }
}