package dhirendra.february03;
//Really good question
public class NumberAsSumOfTwoPrimes {
    //helper function
    private static boolean checkPrime(int number) {
        boolean flag=true;
        int tempNumber = number;
        for(int i=2;i<=number/2;i++) {
            if(tempNumber%i == 0) {
                flag=false;
                break;
            }
        }
        return flag;
    }
    //main method
    public static void isSumOfPrimes(int number) {
        boolean torch = false;
        for(int i=2;i<=number/2;i++) {
            if(checkPrime(i)) {
                if(checkPrime(number-i)) {
                    System.out.println(number+" can be expressed as "+ (number-i) +" + "+i);
                    torch=true;
                }
            }
            if(!torch) {
                System.out.println("The number cannot be expressed as the sum of primes");
            }
        }
    }

    public static void main(String[] args) {
        isSumOfPrimes(100);
    }
}
