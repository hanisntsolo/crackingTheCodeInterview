package dhirendra.february07;
//In main method read an integer
//    (containing only numeric digits without decimal
//    and special characters) and check whether the
//    given number is perfect square or not.
//    If it is print TRUE (as string)
//    else print FALSE(as string )
import java.util.Scanner;

public class December17PAQuestion01 {

    public static void main(String[] args) {
        //Algorithm

        //
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double k = Math.sqrt(number);
        if((int)k == k) { // This line is mandatory
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }


}
