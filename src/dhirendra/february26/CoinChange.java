package dhirendra.february26;

import java.util.Scanner;

public class CoinChange {
  private static long changeCoin(long amount) {
    long coins = 0;
    if(amount%10 == 0)
      return amount/10;
    else if(amount%10 != 0) {
      coins+=amount/10;
      amount = amount%10;
    }
    if(amount%5 == 0)
      return coins+amount/5;
    else if(amount%5 != 0) {
      coins+=amount/5;
      amount = amount%5;
    }
    if(amount%1 == 0) {
      coins+=amount/1;
    }
    return coins;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long test = in.nextLong();in.nextLine();
    for(long i=0;i<test;i++) {
      long amount = in.nextLong();
      long coins = changeCoin(amount);
      System.out.println(coins);
    }
  }
}
