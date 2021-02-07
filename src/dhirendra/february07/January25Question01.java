package dhirendra.february07;
//Write a program to print last characters in a string...

import java.util.Arrays;

//For example
//    INPUT: Dhirendra Pratap Singh
//    OUTPUT: aph
public class January25Question01 {

    public static void printLastCharacter(String str){
        String[] words = str.split(" ");
        System.out.println(words.toString());
        for(String string:words) {
            System.out.print(string.charAt(string.length()-1));
        }
    }

    public static void main(String[] args) {
        printLastCharacter("Dhriendra Pratap Singh");
        printLastCharacter("welcome home buddY");
    }
}
