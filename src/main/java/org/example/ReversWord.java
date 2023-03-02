package org.example;

public class ReversWord {
    public static void main(String[] args) {
        String str = "  Java Concept Of The Day";
        String[] strSplited = str.split(" ");
        String result = "";
        System.out.println(str);

        for (int i = 0; i < strSplited.length; i++) {
            result = result + reverseString(strSplited[i]) + " ";
        }
        System.out.println(result);
        System.out.println();
    }

    public static String reverseString(String str) {
        String revStr = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }
         return revStr;
    }
}