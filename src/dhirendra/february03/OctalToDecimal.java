package dhirendra.february03;

public class OctalToDecimal {
    public static void convertOctalToDecimal(int number) {
        int newNumber = number;
        long decimal=0;
        int i=0;
        while (number>0) {
            int remainder = number%10;
            decimal+= remainder*(Math.pow(8,i));
            number/=10;
            ++i;
        }
        System.out.println(decimal+" is the decimal representation of "+newNumber);
    }

    public static void main(String[] args) {
        convertOctalToDecimal(5);
        convertOctalToDecimal(12);
        convertOctalToDecimal(40);
    }
}
