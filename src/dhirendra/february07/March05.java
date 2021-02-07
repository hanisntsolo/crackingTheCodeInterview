package dhirendra.february07;

public class March05 {
    public static int reverseNumber(int number){
        int finalResult=0;
        while(number!=0) {
            int remainder = number%10;
            finalResult = finalResult*10+remainder;
            number/=10;
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(1243132));
        System.out.println(reverseNumber(2342343));
        System.out.println(reverseNumber(123123));
    }
}
