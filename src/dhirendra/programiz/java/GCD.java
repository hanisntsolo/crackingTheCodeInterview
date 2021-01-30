package dhirendra.programiz.java;

public class GCD {
    public static int greatestDivisor(int num1, int num2) {
        int greatestFactor = 1;
        for(int i=1;i<=num1 && i<=num2;++i) {
            if(num1%i==0 && num2%i == 0) {
                greatestFactor = i;
            }
        }
        return greatestFactor;
    }

    public static void main(String[] args) {
        System.out.println(greatestDivisor(5,10));
        System.out.println(greatestDivisor(5,5));
        System.out.println(greatestDivisor(4,36));
        System.out.println(greatestDivisor(81,153));

    }
}
