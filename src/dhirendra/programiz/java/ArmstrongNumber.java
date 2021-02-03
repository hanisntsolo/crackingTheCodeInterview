package dhirendra.programiz.java;

public class ArmstrongNumber {
    public static boolean checkArmstrong(int number) {
        boolean isArmstrong = false;
        int remainder=0;
        int newNum=0;
        int tempNumber = number;
        //logic to check armstrong number
        while(number>0) {
            remainder = number%10;
            newNum = newNum + (int) Math.pow(remainder,3);
            number/=10;
        }
        System.out.println(newNum);
        System.out.println(tempNumber);
        if(newNum == tempNumber) {
            return !isArmstrong;
        }
        //store
        return isArmstrong;
    }

    public static void main(String[] args) {
        System.out.println(checkArmstrong(153));
        System.out.println(checkArmstrong(45));
        System.out.println(checkArmstrong(56));
    }
}
