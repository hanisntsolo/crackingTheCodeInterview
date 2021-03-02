package dhirendra.march01;

import java.util.Scanner;

public class SieveOfEratoFastest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    byte[] a = new byte[1_000_001];
    long[] out = new long[1_000_001];
    out[0] = 0;
    out[1] = 0;
    out[2] = 2;
    for (int i = 3; i <= 1000_000; i = i + 2) {
      if (a[i] == 0) {
        out[i]=out[i-1]+i;
        for (int j = i + i + i; j <= 1_000_000; j += i + i) {
          a[j] = 1;
        }
      }else {
        out[i]=out[i-1];
      }
      out[i+1]=out[i];
    }

    // start
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {

      int n = in.nextInt();

      System.out.println(out[n]);

    }


  }
}
