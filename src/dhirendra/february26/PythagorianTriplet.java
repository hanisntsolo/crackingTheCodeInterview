package dhirendra.february26;

import java.util.Scanner;

public class PythagorianTriplet {

  private static long pTripletMax(long n) {
    long max=0;
    long prod=1;
    max=prod;
    for(long i=1;i<n/2+1;i++) {
      for(long j=2;j<n/2+1;j++) {
        if(i+j > n-(i+j))
          if(i*i+j*j == (n-(i+j))*(n-(i+j))) {
            prod = i*j*(n-(i+j));
            if(prod>max)
              max=prod;
          }
      }
    }
    if(max == 1)
      return -1;
    return max;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
      long n = in.nextInt();
      long result = pTripletMax(n);
      System.out.println(result);
    }
  }
}
