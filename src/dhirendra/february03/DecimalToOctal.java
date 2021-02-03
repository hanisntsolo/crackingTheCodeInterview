package dhirendra.february03;

public class DecimalToOctal {
    public static void convertDecimalToOctal(int number) {
        int newNumber = number;
        int octal = 0;
        int i=0;
        while(number!=0){
            int remainder= number%8;
            octal+=remainder*Math.pow(10,i);
            number/=8;
            ++i;
        }
        System.out.println("The octal representation of "+newNumber+" is "+octal);
    }

    public static void main(String[] args) {
        convertDecimalToOctal(5);
        convertDecimalToOctal(10);
        convertDecimalToOctal(32);
    }
}
