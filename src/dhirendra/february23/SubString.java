package dhirendra.february23;

import java.sql.SQLOutput;

public class SubString {
    private static void palindrome(String str) {
        int length = str.length();
        String str1 = str.substring(0,length);
        System.out.println(str1);
        if(str == str.substring(0,length)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }
    }

    public static void main(String[] args) {
        palindrome(
            "madam"
        );
    }
}
