package org.example;

public class CharacterOccurances {
    public static void main(String[] args) {
        String str = "Java J2EE Java JSP J2EE";
        System.out.println(str);
        for (int i = 0 ; i < str.length() ; i++){
            int x = 0 ;
            for (int j = 0 ; j < str.length() ; j++){
                if (str.charAt(i)== str.charAt(j)){
                    x++;

                }
            }
            if (str.charAt(i)!='.'){
                System.out.println(str.charAt(i)+ " = " +x);
            }
            String s = "" + str.charAt(i);
            str = str.replace(s, ".");
        }
    }
}
