package dhirendra.february15;

import java.util.Scanner;

public class CaseConversion {
  private static String covertCase(String str) {
    int upper=0;
    int lower=0;
    for(int i=0;i<str.length();i++) {
      if(str.charAt(i)>'A'&& str.charAt(i)<'Z')
        upper++;
      if(str.charAt(i)>'a'&& str.charAt(i)<'z')
        lower++;
    }
    if(upper>lower) {
      str = str.toUpperCase();
      return str;
    }
    if(lower>upper) {
      str = str.toLowerCase();
      return str;
    }
    if(lower == upper) {
      str = "CONFUSED";
    }
    return str;
  }
  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int tests = sc.nextInt();sc.nextLine();
    for(int i=0;i<tests;i++) {
      String str = sc.nextLine();
      String result = covertCase(str);
      System.out.println(result);
    }

  }
}
