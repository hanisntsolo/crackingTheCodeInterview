package dhirendra.february25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeInRange {
  private static boolean isPrime(long n) {
    if(n<=1) {
      return false;
    }
    for(long i=2;i<n;i++) {
      if(n%i==0)
        return false;
    }
    return true;
  }
  private static long primeCatcher(long n) {
    if(n == 1)
      return 2;
    long num = 3;
    long counter = 1;
    while(counter<=n) {
      if(isPrime(num)) {
        counter++;
      if(counter == n)
        break;
      }
      num+=2;
    }
    return num;
  }
  private static Integer primeGenerator(long n) {
    List<Integer> list = new ArrayList<>();
    int index =0;
    int counter=0;
    for(int i=2;i<=10001;i++) {
      if(counter>n)
        break;
      if(isPrime(i)) {
        list.add(i);
        counter++;
      }
    }
    return list.get((int) n-1);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long t = in.nextLong();
    for(int a0 = 0; a0 < t; a0++){
      long n = in.nextLong();
      long result = primeCatcher(n);
      System.out.println(result);
    }
  }
}
