package com.example.java21;

public class SwitchCaseImprovements {

    public static void main(String[] args) {
        String response = "yes";

        switch (response) {
            case "yes", "yeah" -> System.out.println("You said yes!");
            case "no", "nope" -> System.out.println("You said no!");
            default -> System.out.println("Please choose.");
        }
    }
}
