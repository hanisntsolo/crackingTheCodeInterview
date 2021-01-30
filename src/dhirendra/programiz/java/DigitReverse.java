package dhirendra.programiz.java;

public class DigitReverse {
    public static int reverse(int number) {
        int reversedDigit=0;
        int remainder;
        while(number!=0) {
            remainder = number%10;
            reversedDigit = reversedDigit*10+remainder;
            number/=10;
        }
        return reversedDigit;
    }

    public static void main(String[] args) {
        System.out.println(reverse(4321));
    }
}
