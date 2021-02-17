package dhirendra.february03;

public class PrimeBwIntervals {
    public static void checkPrimeNumber(int start, int end){
//        int start =1
        while(start<end) {
            boolean flag=false;
            int newNum = start;
            for(int i=2;i<=newNum/2;i++) { //This line is very very important
                if(start%i == 0) {
                    flag=true;
                    break;
                }
            }
            if(!flag)
                System.out.print(start+" ");
            start++;
        }
    }
    public static void checkPrime(int start, int end){
        while(start<end) {
            boolean flag=false;
            int newNum = start;
            for(int i=2;i<=newNum/2;i++) { //This line is very very important
                if(start%i == 0) {
                    flag=true;
                    break;
                }
            }
            if(!flag)
                System.out.print(start+" ");
            start++;
        }
    }
    public static void main(String[] args) {
        checkPrime(2,90);
    }
}
