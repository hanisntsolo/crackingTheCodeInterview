package dhirendra.programiz.java;

public class PositiveNumber {
    public static void positiveNumber(int n) {
        if(n<0.0) {
            System.out.println("NEGATIVE NUMBER");
        } else if(n>0.0) {
            System.out.println("POSITIVE NUMBER");
        }
    }

    public static void main(String[] args) {
        positiveNumber(3);
        positiveNumber(-3);
    }
}
