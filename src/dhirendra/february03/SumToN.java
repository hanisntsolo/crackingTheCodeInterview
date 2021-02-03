package dhirendra.february03;

public class SumToN {
    public static void sumToN(int number) {
        int sum = sumRecursion(number);
        System.out.println(sum);
    }
    private static int sumRecursion(int num) {
        if(num!=0)
            return num + sumRecursion(num-1);
        else
            return num;
    }

    public static void main(String[] args) {
        sumToN(5);
    }
}
