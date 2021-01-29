package dhirendra.programiz.java;

public class Factorial {
    public static void fact(int number) {
        int result = 1;
        while(number>0) {
            result = result*number;
            number--;
        }
        System.out.println("FACTORIAL OF ENTERED NUMBER IS: "+result);
    }

    public static void main(String[] args) {
        fact(5);
    }
}
