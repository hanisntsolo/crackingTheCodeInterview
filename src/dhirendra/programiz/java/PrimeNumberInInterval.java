package dhirendra.programiz.java;
//Good question
public class PrimeNumberInInterval {
    public static void displayPrimes(int first, int second){
        while(first<second) {
            boolean flag = false;
                for(int i=2;i<=first/2;i++) {
                    //condition for non-prime
                    if(first%i == 0) {
                        flag = true;
                        break;
                    }
                }
                if(!flag && first!=1 && first!=0) {
                    System.out.print(first+ " ");
                }
                first++;
        }
    }

    public static void main(String[] args) {
        displayPrimes(23,234);
    }
}
