package com.example.java21;


import java.util.ArrayList;
import java.util.List;

public class ListImprovements {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("b");
        strList.add("c");

        System.out.println(strList); // [b, c]

        strList.addFirst("a"); // new method addFirst
        System.out.println(strList); // [a, b, c]

        strList.addLast("d"); // new method addLast
        System.out.println(strList); // [a, b, c, d]

        System.out.println(strList.getFirst()); // new method getFirst
        System.out.println(strList.getLast()); // new method getLast
        System.out.println(strList.removeFirst()); // new method removeFirst
        System.out.println(strList.removeLast()); // new method removeLast
    }
}
