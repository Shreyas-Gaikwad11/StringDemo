package org.example;

public class ReverseString {
    public static void main(String[] args) {
        String name = "MyJava";
        System.out.println(name);
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
    }
}