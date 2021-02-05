package dhirendra.february04;

import java.util.Scanner;

public class PrintPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE HEIGHT OF * PYRAMID :");
        int number = scanner.nextInt();
        for(int i=0;i<=number;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("PLEASE ENTER THE HEIGHT OF THE NUMBER PYRAMID :");
        int newNumber = scanner.nextInt();
        numberPyramid(newNumber);
        System.out.println("PLEASE ENTER THE HEIGHT OF THE Alphabet PYRAMID :");
//        int newNumber2 = scanner.nextInt();
        alphabetPyramid(newNumber);
        System.out.println("PLEASE ENTER THE HEIGHT OF THE INVERTED PYRAMID :");
//        int newNumber3 = scanner.nextInt();
        invertedPyramid(newNumber);
        System.out.println("PLEASE ENTER THE HEIGHT OF THE (*)INVERTED PYRAMID :");
//        int newNumber4 = scanner.nextInt();
        invertedPyramid2(newNumber);
        System.out.println("PLEASE ENTER THE HEIGHT OF THE Number INVERTED PYRAMID :");
//        int newNumber5 = scanner.nextInt();
        invertedHalfPyramid2(newNumber);
    }
    private static void invertedHalfPyramid2(int number){
        int k=1;
        for(int i=number;i>=0;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(k);
            }k++;
            System.out.println("");
        }
    }
    private static void numberPyramid(int number){
        for(int i=1;i<=number;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    private static void alphabetPyramid(int number){
        char a = 'A';
        for(int i=1;i<=number;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(a+" ");
            }a++;
            System.out.println("");
        }
    }
    private static void invertedPyramid(int number){
        for(int i=number;i>=0;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    private static void invertedPyramid2(int number){
        for(int i=number;i>=0;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
