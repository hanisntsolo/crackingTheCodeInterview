package dhirendra.february03;

public class DecimalToBinary {
    public static void convertDecimalToBinary(int number) {
        int newNumber = number;
        int binary = 0;
        int i=0;
        while(number!=0){
            int remainder= number%2;
            binary+=remainder*Math.pow(10,i);
            number/=2;
            ++i;
        }
        System.out.println("The binary representation of "+newNumber+" is "+binary);
    }

    public static void main(String[] args) {
        convertDecimalToBinary(5);
        convertDecimalToBinary(10);
        convertDecimalToBinary(32);
    }
}
