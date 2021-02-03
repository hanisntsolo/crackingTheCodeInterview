package dhirendra.february03;

public class FactorialUsingRecursion {
    public static void factorial(int number) {
        int fact = calculateFactorial(number);
        System.out.println("Factorial of number : "+number+" is "+fact);
    }
    private static int calculateFactorial(int num) {
        if(num!=1)
            return num * calculateFactorial(num-1);
        else
            return num;
    }

    public static void main(String[] args) {
        factorial(5); // should print 120
    }
}
