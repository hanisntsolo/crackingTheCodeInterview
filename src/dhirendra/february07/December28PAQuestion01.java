package dhirendra.february07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Write a Program to Print no.of Spaces and Characters in a given input
//
//
//    input: Hello This is ABCD from XYZ city
//    output : No of Spaces : 6 and characters : 26
public class December28PAQuestion01 {
    public static void main(String[] args) {
        int counter=0;
        int counter1=0;
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] textArray = text.toCharArray();
        for(char ch: textArray){
            if(ch == ' '){
                counter++;
            } else {
                counter1++;
            }
        }
        System.out.println("TOTAL CHRACTER IN THE STRING IS: "+counter1);
        System.out.println("TOTOL SPACES IN THE STRING IS: "+counter);
    }
}
