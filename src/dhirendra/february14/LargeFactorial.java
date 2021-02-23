package dhirendra.february14;
//Very important Question
import java.math.BigInteger;
import java.util.Scanner;

//You are given a number N. You need to calculate its factorial. N can be very large.
//
//    Input:
//    The first line contains an integer 'T' denoting the total number of test cases. T testcases follow. Each testcase contains single line of input. The input for each testcase is a number N.
//
//    Output:
//    For each testcase, print the factorial of N.
//
//    Constraints:
//    1 <= T <= 449
//    0 <= N <= 448
//
//    Example:
//    Input:
//    2
//    1
//    20
//    Output:
//    1
//    2432902008176640000
public class LargeFactorial {

  private static BigInteger factorial(int N)
  {
    // Initialize result
    BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

    // Multiply f with 2, 3, ...N
    for (int i = 2; i <= N; i++)
      f = f.multiply(BigInteger.valueOf(i));

    return f;
  }
  // private static long fact(long number) {
  //   if(number == 1) {
  //     return 1;
  //   }
  //   return number* fact(number-1);
  // }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    long factorial = 1;
    sc.nextLine();
    for(int i=0;i<number;i++) {
      int query = sc.nextInt();
      // factorial *= factorial(query);
      System.out.println(factorial(query));
    }

  }
}
