package dhirendra.february23;

import java.util.Scanner;

public class LargestPalindrome {
  private static long reverseNumber(long n) {
    long remainder=0;
    long number=0;
    while(n!=0) {
      remainder = n%10;
      number = number*10 + remainder;
      n/=10;
    }
    return number;
  }
  private static long largestPalindromeProduct(long number) {
    long currentLargest=0;
    long maxLargest=0;
    for(int i=143;i<=999;i+=11) {
      for( int j = 101;j<=999;j+=1) {
//        System.out.println("INSIDE SECOND FOR");
        long product = i*j;
        if(product == reverseNumber(product) && product<=number) {
          currentLargest = product;
          if(currentLargest>maxLargest) {
            System.out.println("i = "+i+" j = "+j);
            maxLargest = currentLargest;
          }
        }

      }
    }
    return maxLargest;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
      long n = in.nextLong();
      long reverse = reverseNumber(n);
      System.out.println(reverse);
      long result= largestPalindromeProduct(n);
      System.out.println(result);
    }
  }
}
