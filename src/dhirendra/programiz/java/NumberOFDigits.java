package dhirendra.programiz.java;

public class NumberOFDigits {
    public static int countDigits(int number) {
        int count=0;
        while(number!=0) {
            number/=10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
       int count = countDigits(3429);
        System.out.println(count);
    }
}
