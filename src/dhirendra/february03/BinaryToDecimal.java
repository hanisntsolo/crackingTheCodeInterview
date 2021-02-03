package dhirendra.february03;

public class BinaryToDecimal {
    public static void convertBinaryToDecimal(int number) {
        int newNumber = number;
        long decimal=0;
        int i=0;
        while (number>0) {
            int remainder = number%10;
            decimal+= remainder*(Math.pow(2,i));
            number/=10;
            ++i;
        }
        System.out.println(decimal+" is the decimal representation of "+newNumber);
    }

    public static void main(String[] args) {
        convertBinaryToDecimal(1111);
        convertBinaryToDecimal(1010);
        convertBinaryToDecimal(110110110);
    }
}
