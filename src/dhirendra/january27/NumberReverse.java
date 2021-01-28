package dhirendra.january27;

public class NumberReverse {
    public static int reverseNumber(int num) {
        int remainder,newNum = 0;
        while(num>0) {
            remainder = num%10;
            newNum = newNum*10+remainder; // Step to be remembered..
            num /= 10;
        }
        return newNum;
    }

    public static void main(String[] args) {
       int num =  reverseNumber(2345);
        System.out.println(num);
    }
}
