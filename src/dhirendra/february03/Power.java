package dhirendra.february03;

public class Power {
    public static void calculatePower(int num, int power){
        long result = powerCalculate(num,power);
        System.out.println("Number "+num+" raised to "+power+" is: "+result);
    }
    private static long powerCalculate(int num,int power) {
        if(power!=0)
            return num*powerCalculate(num,power-1);
        else
            return 1; // This line is mandatory in power calculation
    }

    public static void main(String[] args) {
        calculatePower(3,2);
    }
}
