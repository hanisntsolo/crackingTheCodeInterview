package dhirendra.february03;

public class ArmstrongBwIntervals {
    public static void checkArm(int number){
        int newNumber = number;
        int finalNumber = number;
        int counter=0;
        while(number>0){
            counter++;
            number/=10;
        }
        int result=0;
        int remainder=0;
        while(newNumber>0){
            remainder=newNumber%10;
            result+= Math.pow(remainder,counter);
            newNumber/=10;
        }
        if(result == finalNumber) {
            System.out.println("ArmStrong");
        } else {
            System.out.println("Not armstrong");
        }
    }
    public static void checkBetweenIntervals(int start, int end) {
        while(start<end) {
            int number = start;
            int newNumber = number;
            int counter=0;
            while(number>0) {
                counter++;
                number/=10;
            }
            int remainder=0;
            int result=0;
            while(newNumber>0) {
                remainder=newNumber%10;
                result+=Math.pow(remainder,counter);
                newNumber/=10;
            }
            if(result == start) {
                System.out.print(result+" ");
            }
            start++;
        }
    }
    public static void main(String[] args) {
        checkArm(153);
        checkArm(34);
        checkBetweenIntervals(23,2098);
    }
}
