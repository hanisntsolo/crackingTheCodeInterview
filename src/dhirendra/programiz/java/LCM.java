package dhirendra.programiz.java;

public class LCM {
    public static int lowestMultiple(int num1, int num2) {
        int greatestFactor = 1;
        for(int i=1;i<=num1 && i<=num2;++i) {
            if(num1%i==0 && num2%i == 0) {
                greatestFactor = i;
            }
        }
        return (num1*num2)/greatestFactor;
    }

    public static void main(String[] args) {
        System.out.println(lowestMultiple(5,10));
        System.out.println(lowestMultiple(5,5));
        System.out.println(lowestMultiple(4,36));
        System.out.println(lowestMultiple(81,153));

    }
}
