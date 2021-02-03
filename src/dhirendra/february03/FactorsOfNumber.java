package dhirendra.february03;

public class FactorsOfNumber {
    public static void checkFactors(int number){
        int tempNumber = number;
        int start=2;
        while(start<=tempNumber) {
            if(tempNumber%start == 0)
                System.out.print(start+" ");
            start++;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        checkFactors(3);
        checkFactors(6);
    }
}
