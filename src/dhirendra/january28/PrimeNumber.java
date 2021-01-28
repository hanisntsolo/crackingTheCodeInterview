package dhirendra.january28;

public class PrimeNumber {
    public static void primeChecker(int number) {
        int flag =0;
        for(int i=2;i<=number/2;i++) {
            if(number%i==0) { //main logic to be remembered !!
                flag = 1;
                break;
            }
        }
        if(flag == 1) {
            System.out.println("The given number "+ number +" is NOT PRIME");
        } else if(flag == 0) {
            System.out.println("VOILA! the given number "+ number +" is PRIME");
        }
    }

    public static void main(String[] args) {
        primeChecker(5);
        primeChecker(23);
        primeChecker(7);
        primeChecker(45);
        primeChecker(13);
        primeChecker(67);
        primeChecker(78);
    }
}
