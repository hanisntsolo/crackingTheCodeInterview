package dhirendra.february12;

import java.util.Scanner;

public class RingTheBellUsingLCM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();sc.nextLine();
    for(int i=0;i<times;i++) {
      int first = sc.nextInt();
      int second = sc.nextInt();
      System.out.println(ringBells(first,second));
    }
  }
  private static int ringBells(int bell1, int bell2) {
    int product = bell1 * bell2;
    int lcm = product / gcd(bell1, bell2);
    return lcm;
  }
  private static int gcd(int n1, int n2) {
    if(n2!=0)
      return gcd(n2,n1%n2);
    else
      return n1;
  }
}
