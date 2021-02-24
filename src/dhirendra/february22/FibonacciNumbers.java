package dhirendra.february22;

import java.util.Random;

public class FibonacciNumbers {
    private static int fibonacci(int number) {
        if(number<=1) {
            return number;
        } else {
            return fibonacci(number-1)+fibonacci(number-2);
        }
    }
    private static int fibonacci1(int number) {
        int result=0;
        int[] arr = new int[number];
        if(number ==0) {
            return 0;
        } else if(number == 1) {
            return number;
        } else {
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<number;i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int j=0;j<number;j++) {
            result+=arr[j];
        }
        }
        return result;
    }
    public static void main(String[] args) {
        stressTesting();
    }
    private static void stressTesting() {
        while (true) {
            Random random = new Random();
            int number = Math.abs(random.nextInt() % 20 + 2);
            int sum1 = fibonacci1(number);
            int sum2 = fibonacci1(number);
            if (sum1 != sum2) {
                System.out.println("We found something here " + number);
                break;
            } else {
                System.out.println("PASSED!");
                System.out.print(fibonacci(number)+" ");
                continue;
            }
        }

    }
}
